/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rchaves
 */
@Entity
@Table(name = "contas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contas.findAll", query = "SELECT c FROM Contas c"),
    @NamedQuery(name = "Contas.findById", query = "SELECT c FROM Contas c WHERE c.id = :id"),
    @NamedQuery(name = "Contas.findByDataVencimento", query = "SELECT c FROM Contas c WHERE c.dataVencimento = :dataVencimento"),
    @NamedQuery(name = "Contas.findByValor", query = "SELECT c FROM Contas c WHERE c.valor = :valor"),
    @NamedQuery(name = "Contas.findByUsuarioId", query = "SELECT c FROM Contas c WHERE c.usuarioId = :usuarioId")})
public class Contas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "data_vencimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataVencimento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private float valor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_id")
    private int usuarioId;

    public Contas() {
    }

    public Contas(Integer id) {
        this.id = id;
    }

    public Contas(Integer id, Date dataVencimento, float valor, int usuarioId) {
        this.id = id;
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.usuarioId = usuarioId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contas)) {
            return false;
        }
        Contas other = (Contas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "beans.Contas[ id=" + id + " ]";
    }
    
}
