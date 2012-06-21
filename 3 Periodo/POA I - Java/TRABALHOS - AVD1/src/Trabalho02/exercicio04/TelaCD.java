/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho02.exercicio04;

import javax.swing.JOptionPane;

/**
 *
 * @author victor's MacBook
 */
public class TelaCD {

    public static void main(String[] args) {
        TelaCD tela = new TelaCD();
        CD cd = new CD();

        int op;
        boolean ok = false;

        do {
            op = tela.montarTela();
            switch (op) {
                case 1:
                    cd.setTitulo(tela.lerDados("Entre com o [Título] do CD: "));
                    cd.setGenero(tela.lerDados("Entre com o [Gênero] do CD: "));
                    cd.setInterprete(tela.lerDados("Entre com o [Intérprete] do CD: "));
                    cd.setAnoLancamento(Integer.parseInt(tela.lerDados("Entre com o [Ano de Lançamento] do CD: ")));
                    ok = true;
                    break;
                case 2:
                    if (!ok) {
                        tela.mostrarErro("Não existe CD Cadastrado, por favor cadastre um.");
                    } else {
                        Faixa fx = new Faixa();
                        fx.setNome(tela.lerDados("Entre com o [Nome] da faixa: "));
                        fx.setAutor(tela.lerDados("Entre com o [Autor] da faixa: "));

                        cd.addFaixa(fx);
                    }
                    break;
                case 3:
                    tela.mostrarDados(cd);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    tela.mostrarErro("Opção [" + op + "] Inválida!!");
                    break;
            }
        } while (op != 4);
    }

    public int montarTela() {
        String menu = ""
                + "[1] - Cadastrar CD \n"
                + "[2] - Adicionar Faixas \n"
                + "[3] - Visualizar CD \n"
                + "[4] - Sair \n";

        return Integer.parseInt(
                JOptionPane.showInputDialog(null, menu, "Aula de Java - Álbum CD", JOptionPane.PLAIN_MESSAGE));
    }

    public String lerDados(String msg) {
        return JOptionPane.showInputDialog(null, msg, "Aula de Java - Álbum CD", JOptionPane.QUESTION_MESSAGE);
    }

    public void mostrarDados(CD cd) {
        if (cd.getTitulo() == null) {
            mostrarErro("Não existe CD Cadastrado, por favor cadastre um.");
        } else {
            String dados, faixas = "";

            dados = ""
                    + "Título: " + cd.getTitulo() + "\n"
                    + "Gênero: " + cd.getGenero() + "\n"
                    + "Ano Lançamento: " + cd.getAnoLancamento() + "\n"
                    + "Interprete: " + cd.getInterprete() + "\n\n"
                    + "            FAIXAS\n";

            for (int i = 0; i < cd.getFaixas().size(); i++) {
                faixas += (i + 1) + ". " + cd.getFaixas().get(i).getNome() + " - " + cd.getFaixas().get(i).getAutor() + "\n";
            }

            dados += faixas;

            JOptionPane.showMessageDialog(null, dados, "Aula de Java - Álbum CD", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void mostrarErro(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Aula de Java - Álbum CD", JOptionPane.ERROR_MESSAGE);
    }
}
