/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho02.exercicio02;

import javax.swing.JOptionPane;
import util.Mensagens;

/**
 *
 * @author victor's MacBook
 */
public class Principal {

    static Mensagens msgs = new Mensagens();

    public static void main(String[] args) {
        Respostas resposta = new Respostas();
        Pontos ponto = new Pontos();


        String menu = "[Jogo] Diga a Resposta [Jogo]\n\n";

        menu += "[1] - Cadastrar Perguntas e Respostas\n";
        menu += "[2] - Jogar\n";
        menu += "[0] - Sair\n";
        menu += "\n";

        boolean ok = false;
        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu, msgs.Titulo(), msgs.Question()));
            switch (op) {
                case 1:
                    resposta.setPer1(msgs.get("Entre com a [1ª Pergunta]:\n", msgs.Question()));
                    resposta.setResp1(msgs.get("Entre com a [Resposta] para a [1ª Pergunta]:\n", msgs.Information()));

                    resposta.setPer2(msgs.get("Entre com a [2ª Pergunta]:\n", msgs.Question()));
                    resposta.setResp2(msgs.get("Entre com a [Resposta] para a [2ª Pergunta]:\n", msgs.Information()));

                    resposta.setPer3(msgs.get("Entre com a [3ª Pergunta]:\n", msgs.Question()));
                    resposta.setResp3(msgs.get("Entre com a [Resposta] para a [3ª Pergunta]:\n", msgs.Information()));

                    resposta.setPer4(msgs.get("Entre com a [4ª Pergunta]:\n", msgs.Question()));
                    resposta.setResp4(msgs.get("Entre com a [Resposta] para a [4ª Pergunta]:\n", msgs.Information()));

                    resposta.setPer5(msgs.get("Entre com a [5ª Pergunta]:\n", msgs.Question()));
                    resposta.setResp5(msgs.get("Entre com a [Resposta] para a [5ª Pergunta]:\n", msgs.Information()));

                    ok = true;
                    break;
                case 2:
                    if (ok) {
                        
                        
                        if (perguntar(resposta.getPer1(),status(ponto)).equals(resposta.getResp1())) {
                            ponto.setAcertos(ponto.getAcertos()+1);
                        }else{
                            ponto.setErros(ponto.getErros()+1);
                        }
                        
                        if (perguntar(resposta.getPer2(),status(ponto)).equals(resposta.getResp2())) {
                            ponto.setAcertos(ponto.getAcertos()+1);
                        }else{
                            ponto.setErros(ponto.getErros()+1);
                        }
                        
                        if (perguntar(resposta.getPer3(),status(ponto)).equals(resposta.getResp3())) {
                            ponto.setAcertos(ponto.getAcertos()+1);
                        }else{
                            ponto.setErros(ponto.getErros()+1);
                        }
                        
                        if (perguntar(resposta.getPer4(),status(ponto)).equals(resposta.getResp4())) {
                            ponto.setAcertos(ponto.getAcertos()+1);
                        }else{
                            ponto.setErros(ponto.getErros()+1);
                        }
                        
                        if (perguntar(resposta.getPer5(),status(ponto)).equals(resposta.getResp1())) {
                            ponto.setAcertos(ponto.getAcertos()+1);
                        }else{
                            ponto.setErros(ponto.getErros()+1);
                        }
                        
                        msgs.show("\tScore\n\nAcertos: "+ponto.porcentagemAcertos()+"%\nErros: "+ponto.porcentagemErros()+"%", msgs.Information());
                    }else{
                        msgs.show("Não há perguntas cadastradas. Por Favor cadastre-as.", msgs.Warning());
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    msgs.show("Opção [" + op + "] inválida", msgs.Warning());
                    break;
            }
        } while (op != 0);


    }

    public static String perguntar(String perg, String titulo) {
        return JOptionPane.showInputDialog(null, perg, titulo, msgs.Question());
    }
    
    public static String status(Pontos ponto){
        return "Acertos: "+ponto.getAcertos()+" | Erros: "+ponto.getErros()+"\n";
    }
}
