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
public class For {

    public static void main(String[] args) {
        String msg = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                msg += i + " - \n";
            } else {
                msg += i + " - ";
            }
        }

        JOptionPane.showMessageDialog(null, msg,
                "Aula de Java", JOptionPane.INFORMATION_MESSAGE);
    }
}
