package beans;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped; 
import javax.faces.context.FacesContext; 
import modelos.Contas;
import modelos.Usuarios;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VictorHugo
 */
@ManagedBean
@ViewScoped
public class BeanContas {
    private List<Contas> contas;
    private String mensagem = "";
    private Contas conta;
    private Usuarios usuarioLogado;
    private Contas contaSelecionada;
    
    @PostConstruct
    public void construtor() throws IOException {
        //BeanLogin b = new BeanLogin();
        usuarioLogado = (Usuarios)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario_logado");
        if(usuarioLogado == null){
            FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
        }else{
            if(getContas() == null){
                consultarContas();
            }
            if(conta == null){
                conta = new Contas();
                conta.setDataVencimento(new Date());
                conta.setUsuarioId(usuarioLogado.getId());
            }
        }
    }
    
    /**
     * @return the contas
     */
    public List<Contas> getContas() {
        return contas;
    }

    /**
     * @param contas the contas to set
     */
    public void setContas(List<Contas> contas) {
        this.contas = contas;
    }

    /**
     * @return the mensagem
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * @param mensagem the mensagem to set
     */
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the conta
     */
    public Contas getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(Contas conta) {
        this.conta = conta;
    }

    private void consultarContas() {
        ContasJpaController conts = new ContasJpaController();
        setContas((List<Contas>) conts.getEntityManager().createNamedQuery("Contas.findByUsuarioId")
                .setParameter("usuarioId", usuarioLogado.getId()).getResultList());
    }
    
    public void excluir(){
        ContasJpaController con = new ContasJpaController();
        
        try {
            con.destroy(contaSelecionada.getId());
            setMensagem("Conta #" + contaSelecionada.getId() + " excluída com sucesso");
            consultarContas();
        } catch (Exception ex) {
            this.setMensagem("Erro ao excluir: " + ex.getMessage());
        }
    }
    
    public void cadastrar(){
        ContasJpaController con = new ContasJpaController();
        conta.setUsuarioId(usuarioLogado.getId());
        try {
            con.create(conta);
            this.setMensagem("Conta cadastrada com sucesso");
            consultarContas();
        } catch (Exception ex) {
            this.setMensagem("Erro ao cadastrar: " + ex.getMessage());
        }
    }

    /**
     * @return the contaSelecionada
     */
    public Contas getContaSelecionada() {
        return contaSelecionada;
    }

    /**
     * @param contaSelecionada the contaSelecionada to set
     */
    public void setContaSelecionada(Contas contaSelecionada) {
        this.contaSelecionada = contaSelecionada;
    }
    
    
}
