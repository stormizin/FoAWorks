/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author 201110476
 */
public class If {

    public static void main(String[] args) {
        int num = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Entre com um número:",
                "Aula de Java", JOptionPane.QUESTION_MESSAGE));

        String msg = "O número \n" + num + "\n é ";

        if (num % 2 == 0) {
            msg += "PAR.";
        } else if (num % 2 != 0 && num != 0) {
            msg += "IMPAR.";
        }

        JOptionPane.showMessageDialog(null, msg,
                "Aula de Java", JOptionPane.INFORMATION_MESSAGE);
    }
}
