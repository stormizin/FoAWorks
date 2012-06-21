/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho02.exercicio02;

/**
 *
 * @author victor's MacBook
 */
public class Pontos {

    private int acertos = 0;
    private int erros = 0;

    public int getAcertos() {
        return this.acertos;
    }

    public void setAcertos(int acertos) {
        if (this.getAcertos() < 5) {
            this.acertos = acertos;
        }
    }

    public int getErros() {
        return this.erros;
    }

    public void setErros(int erros) {
        if (this.getErros() < 5) {
            this.erros = erros;
        }
    }

    public double porcentagemAcertos() {
        return (this.getAcertos() * 100) / 5;
    }

    public double porcentagemErros() {
        return (this.getErros() * 100) / 5;
    }
}
