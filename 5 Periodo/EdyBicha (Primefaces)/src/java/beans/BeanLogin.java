package beans;

import beans.exceptions.RollbackFailureException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped; 
import javax.faces.context.FacesContext;
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
@SessionScoped
public class BeanLogin {
    private Usuarios usuario;
    private Usuarios usuarioLogado;
    private String mensagem = "";

    @PostConstruct
    public void construtor() {
        if(usuario == null){
            usuario = new Usuarios();
        }
        Usuarios u = (Usuarios)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario_logado");
        if(u != null){
            this.usuarioLogado = u;
        }
    } 

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public void cadastrar(){
        if(usuario.getNome().isEmpty()){
            this.setMensagem("Preencha o nome.");
        }else{
            UsuariosJpaController usu = new UsuariosJpaController();
            try {
                usu.create(usuario);
                this.setMensagem("Cadastrado com sucesso");
            } catch (Exception ex) {
                if(ex.getMessage().indexOf("Duplicate") > -1){
                    this.setMensagem("Login já cadastrado.");
                }else{
                    this.setMensagem("Erro ao cadastrar: " + ex.getMessage());
                }

            }
        }
    }

    public void login(){
        UsuariosJpaController usu = new UsuariosJpaController();
        try{
            Usuarios resultado = (Usuarios) usu.getEntityManager().createNamedQuery("Usuarios.findByLoginAndSenha")
                .setParameter("login", usuario.getLogin())
                .setParameter("senha", usuario.getSenha()).getSingleResult();
            
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario_logado", resultado);
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/contas.xhtml");
        }catch(Exception ex){
            this.setMensagem("Usuário ou senha inválidos: " + ex.getMessage());
        }
    }
    
    /*public void logout() throws IOException{
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
        FacesContext.getCurrentInstance().getExternalContext().redirect("login.xhtml");
    }*/
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    /**
     * @return the usuarioLogado
     */
    public Usuarios getUsuarioLogado() {
        /*Usuarios u = new Usuarios();
        u.setNome("josé");
        return u;*/
       return usuarioLogado;
    }

    /**
     * @param usuarioLogado the usuarioLogado to set
     */
    public void setUsuarioLogado(Usuarios usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
    
    public void setUsuarioLogado(String usuarioLogadoNome) {
        Usuarios u = new Usuarios();
        u.setNome(usuarioLogadoNome);
        this.usuarioLogado = u;
    }
    
}
