/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import beans.exceptions.NonexistentEntityException;
import beans.exceptions.RollbackFailureException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;
import modelos.Contas;
import modelos.Contas;

/**
 *
 * @author rchaves
 */
public class ContasJpaController implements Serializable {

    public ContasJpaController() {
        this.emf = Persistence.createEntityManagerFactory("EdyBichaPU");
        //this.utx = (UserTransaction) getEntityManager().getTransaction();
    }
    private EntityManagerFactory emf = null;
    private UserTransaction utx = null;
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

     public void create(Contas Contas) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(Contas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Contas Contas) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Contas = em.merge(Contas);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = Contas.getId();
                if (findContas(id) == null) {
                    throw new NonexistentEntityException("The Contas with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Contas Contas;
            try {
                Contas = em.getReference(Contas.class, id);
                Contas.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The Contas with id " + id + " no longer exists.", enfe);
            }
            em.remove(Contas);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Contas> findContasEntities() {
        return findContasEntities(true, -1, -1);
    }

    public List<Contas> findContasEntities(int maxResults, int firstResult) {
        return findContasEntities(false, maxResults, firstResult);
    }

    private List<Contas> findContasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Contas.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Contas findContas(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Contas.class, id);
        } finally {
            em.close();
        }
    }

    public int getContasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Contas> rt = cq.from(Contas.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}