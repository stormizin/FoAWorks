/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho02.exercicio03;

import com.sun.org.apache.bcel.internal.generic.GOTO;
import javax.swing.JOptionPane;
import sun.org.mozilla.javascript.internal.ast.TryStatement;
import util.Mensagens;

/**
 *
 * @author victor's MacBook
 */
public class TrataErroPrincipal {

    static Mensagens msgs = new Mensagens();

    public static void main(String[] args) {
        ClientesTrataErro clt = new ClientesTrataErro();
        TrataErroPrincipal tep = new TrataErroPrincipal();

        boolean ok = false;
        int op = 0;
        do {

            op = tep.menu();
            switch (op) {
                case 1:
                    while (!ok) {
                        try {
                            clt.setNome(tep.lerDados("Entre com o Nome: ", msgs.Question()));
                            clt.setMail(tep.lerDados("Entre com o Email: ", msgs.Question()));
                            ok = true;
                            
                        } catch (ValidarException ve) {
                            tep.imprimirDados(ve.getMessage(), msgs.Error());
                            ok = false;
                        }
                    }
                    ok = false;
                    break;
                case 2:
                    tep.imprimirDados("Nome: " + clt.getNome() + "\nEmail: " + clt.getMail(), msgs.Information());
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    tep.imprimirDados("Opção Inválida", msgs.Error());
                    break;
            }

        } while (op != 3);


    }

    public int menu() {
        return Integer.parseInt(this.lerDados(""
                + "[1] - Ler Dados de [Nome] e [Email].\n"
                + "[2] - Mostrar Dados lidos.\n"
                + "[3] - Sair\n"
                + "", msgs.Information()));
    }

    public String lerDados(String msg, int icon) {
        return JOptionPane.showInputDialog(null, msg, "Tratar Erro", icon);
    }

    public void imprimirDados(String msg, int icon) {
        JOptionPane.showMessageDialog(null, msg, "Tratar Erro", icon);
    }
}
