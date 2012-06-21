/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliares;

import javax.swing.JOptionPane;

/**
 *
 * @author muky
 */
public class Utilitario {

    public static void mensagem(String msg, int type) {
        JOptionPane.showMessageDialog(null, msg, "Cheque Platinum", type);
    }

    public static String pergunta(String msg) {
        return JOptionPane.showInputDialog(null, msg, "Cheque Platinum", JOptionPane.QUESTION_MESSAGE);
    }
}
