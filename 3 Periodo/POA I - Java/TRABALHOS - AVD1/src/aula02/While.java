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
public class While {

    public static void main(String[] args) {
        String msg = "";

        int a = 0;

        while (a == 0) {
            a = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Entre com o valor de A: ",
                    "Aula de Java", JOptionPane.QUESTION_MESSAGE));
        }
        
        JOptionPane.showMessageDialog(null, "A variável A vale: " + a,
                "Aula de Java", JOptionPane.INFORMATION_MESSAGE);
    }
}
