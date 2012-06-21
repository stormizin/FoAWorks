/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho02.exercicio03;

/**
 *
 * @author victor's MacBook
 */
public class ClientesTrataErro {

    private String nome;
    private String mail;

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) throws ValidarException {
        int arroba = mail.indexOf("@");
        int ponto = mail.lastIndexOf(".");
        int tamanho = mail.trim().length(); //tamanho email maior que 4 caracteres
        int usutam = mail.split("@")[0].trim().length(); // 3 caracteres antes do @

        // verifica arroba depois do último ponto existente
        // se existe arroba
        // email tem mais de 4 caracteres sem espaço nulo
        // antes do arroba tem mais de 3 caracteres não nulos

        if (arroba > ponto) {
            throw new ValidarException("O E-Mail \"" + mail + "\" é inválido!\n Formato inválido");
        } else if (arroba == -1) {
            throw new ValidarException("O E-Mail \"" + mail + "\" é inválido!\n Não possui @");
        } else if (tamanho < 4) {
            throw new ValidarException("O E-Mail \"" + mail + "\" é inválido!\n Tamanho do e-mail muito curto");
        } else if (usutam < 3) {
            throw new ValidarException("O E-Mail \"" + mail + "\" é inválido!\n Usuário do e-mail muito curto");
        } else {
            this.mail = mail;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) throws ValidarException {
        if (!nome.equals("")) {
            this.nome = nome;
        } else {
            throw new ValidarException("Nome é obrigatório");
        }
    }
}
