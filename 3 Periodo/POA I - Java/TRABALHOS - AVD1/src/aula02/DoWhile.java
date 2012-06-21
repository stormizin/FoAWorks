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
public class DoWhile {

    public static void main(String[] args) {
        String msg = "";

        int a = 0;

        do {
            a = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Entre com o valor de A: ",
                    "Aula de Java", JOptionPane.QUESTION_MESSAGE));
        } while (a == 0);

        JOptionPane.showMessageDialog(null, "A variável A vale: " + a,
                "Aula de Java", JOptionPane.INFORMATION_MESSAGE);
    }
}
