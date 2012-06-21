/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Trabalho01.entidade;

import Trabalho01.Jogo;
import Trabalho01.util.Mensagens;
import javax.swing.JOptionPane;

/**
 *
 * @author victor's MacBook
 */
public class Controle {

    Jogo jogo = new Jogo();
    Mensagens msgs = new Mensagens();

    private int vez;
    private String[] posicoes = new String[9];

    /*
     * Gets and Sets
     */
    public String[] getPosicoes() {
        return this.posicoes;
    }

    public void setPosicoes(int posicao, String valor) {
        this.posicoes[posicao] = valor;
    }

    public int getVez() {
        return this.vez;
    }

    public void setVez(int vez) {
        this.vez = vez;
    }

    /*
     * Operações
     */

    public void setJogadorInicial(int jogador){
        if(jogador != 1 && jogador != 2){
            jogo.mostrarMensagem("Jogador Inválido", msgs.Warning());
        }else{
            for (int i = 0; i < 9; i++) {
                posicoes[i] = "-";
            }
            this.setVez(jogador);
        }

    }

    public void trocarVez(){
        switch(this.getVez()){
            case 1:
                this.setVez(2);
                break;
            case 2:
                this.setVez(1);
                break;
            default:
                System.out.println("Hey!_@WE@!");
                break;
        }
    }

    public void gravarJogada(int posicao, String marca){
        switch(posicao){
            case 1:
                this.setPosicoes(0, marca);
                break;
            case 2:
                this.setPosicoes(1, marca);
                break;
            case 3:
                this.setPosicoes(2, marca);
                break;
            case 4:
                this.setPosicoes(3, marca);
                break;
            case 5:
                this.setPosicoes(4, marca);
                break;
            case 6:
                this.setPosicoes(5, marca);
                break;
            case 7:
                this.setPosicoes(6, marca);
                break;
            case 8:
                this.setPosicoes(7, marca);
                break;
            case 9:
                this.setPosicoes(8, marca);
                break;
            default:
                break;
        }
    }

    public String getJogada(int posicao){
        return this.getPosicoes()[posicao];
    }
}
