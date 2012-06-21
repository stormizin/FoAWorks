/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho01;

import Trabalho01.entidade.Controle;
import Trabalho01.entidade.Jogador;
import Trabalho01.util.Mensagens;
import javax.swing.JOptionPane;

/**
 *
 * @author victor's MacBook
 */
public class Jogo {
    /*
     * VARIAVEIS GLOBAIS
     */

    static Jogador jogador = new Jogador();
    static Controle controle = new Controle();
    static Mensagens msgs = new Mensagens();

    /*
     * # MAIN #
     */
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogador.setJogador1(jogo.pergunta(" Entre com o nome do [Jogador 1]:"));
        jogador.setJogador2(jogo.pergunta(" Entre com o nome do [Jogador 2]:"));

        controle.setJogadorInicial(
                Integer.parseInt(
                jogo.pergunta(""
                + " Qual jogador começa jogando ?"
                + "\n [1] - " + jogador.getJogador1() + ""
                + "\n [2] - " + jogador.getJogador2() + ""
                + "\n\n")));


        for (int i = 0; i < 9; i++) {
            int pos;
            do {
                pos = jogo.mostrarTela();
                System.out.println("i: " + i + " jogada: " + controle.getJogada(pos-1));
                if (pos == 0) {
                    jogo.mostrarMensagem("Posição [0] inválida!", msgs.Warning());
                } else if (!controle.getJogada(pos - 1).equals("-")) {
                    jogo.mostrarMensagem("Posição [" + pos + "] já preenchida!", msgs.Warning());
                }
            } while (pos == 0 || !controle.getJogada(pos - 1).equals("-"));

            jogo.efetuarJogada(pos);
            System.out.println("i: " + i + " jogada: " + controle.getJogada(pos - 1));

            if (jogo.verificarVencedor()) {
                System.exit(0);
            }


        }
        if (!jogo.verificarVencedor()) {
            jogo.mostrarMensagem("# VELHA #", msgs.Error());
        }

    }

    public int mostrarTela() {
        String temp = "";
        String nomeJogador = "";

        if (controle.getVez() == 1) {
            nomeJogador = jogador.getJogador1();
        } else {
            nomeJogador = jogador.getJogador2();
        }

        temp += controle.getJogada(0) + " | " + controle.getJogada(1) + " | " + controle.getJogada(2);
        temp += "\n";
        temp += controle.getJogada(3) + " | " + controle.getJogada(4) + " | " + controle.getJogada(5);
        temp += "\n";
        temp += controle.getJogada(6) + " | " + controle.getJogada(7) + " | " + controle.getJogada(8);

        return Integer.parseInt(this.pergunta(temp + "\n\n [" + nomeJogador + "] Escolha uma posição: "));
    }

    public boolean verificarVencedor() {
        String[] combinacoes = new String[8];

        // Linhas
        combinacoes[0] = "" + controle.getJogada(0) + controle.getJogada(1) + controle.getJogada(2);
        combinacoes[1] = "" + controle.getJogada(3) + controle.getJogada(4) + controle.getJogada(5);
        combinacoes[2] = "" + controle.getJogada(6) + controle.getJogada(7) + controle.getJogada(8);
        // Colunas
        combinacoes[3] = "" + controle.getJogada(0) + controle.getJogada(3) + controle.getJogada(6);
        combinacoes[4] = "" + controle.getJogada(1) + controle.getJogada(4) + controle.getJogada(7);
        combinacoes[5] = "" + controle.getJogada(2) + controle.getJogada(5) + controle.getJogada(8);
        // Diagonais
        combinacoes[6] = "" + controle.getJogada(0) + controle.getJogada(4) + controle.getJogada(8);
        combinacoes[7] = "" + controle.getJogada(2) + controle.getJogada(4) + controle.getJogada(6);

        for (int i = 0; i < 8; i++) {
            if (combinacoes[i].equals("XXX")) {
                this.mostrarMensagem(jogador.getJogador1() + " é o vencedor", msgs.Information());
                return true;
            } else if (combinacoes[i].equals("OOO")) {
                this.mostrarMensagem(jogador.getJogador2() + " é o vencedor", msgs.Information());
                return true;
            }
        }

        int temValor = 0;
        for (int j = 0; j < 9; j++) {
            if (!controle.getJogada(j).equals("-")) {
                temValor += 1;
            }
        }
        if (temValor == 9) {
            return false;
        }
        return false;
    }

    public void efetuarJogada(int posicao) {
//        if (posicao == 0) {
//            this.mostrarMensagem("Posição ["+posicao+"]inválida!", msgs.Error());
//        } else {
//            if (!controle.getJogada(posicao).equals("-")) {
//                this.mostrarMensagem("Campo " + posicao + " já preenchido!", msgs.Warning());
//            } else {
        if (controle.getVez() == 1) {
            controle.gravarJogada(posicao, "X");
            controle.trocarVez();
        } else if (controle.getVez() == 2) {
            controle.gravarJogada(posicao, "O");
            controle.trocarVez();
        }
//            }
//        }

    }

    public void mostrarMensagem(String msg, int tipo) {
        JOptionPane.showMessageDialog(null, msg, msgs.Titulo(), tipo);
    }

    public String pergunta(String msg) {
        return JOptionPane.showInputDialog(null, msg, msgs.Titulo(), msgs.Question());
    }
}
