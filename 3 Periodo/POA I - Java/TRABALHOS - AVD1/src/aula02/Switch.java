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
public class Switch {

    public static void main(String[] args) {
        String msg = "";
        int d = 0;

        do {
            d = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Escolha um número de 1 a 7:",
                    "Aula de Java", JOptionPane.QUESTION_MESSAGE));
        } while (d <= 1 && d >= 7);

        switch (d) {
            case 1:
                msg = "Domingo";
                break;
            case 2:
                msg = "Segunda-Feira";
                break;
            case 3:
                msg = "Terça-Feira";
                break;
            case 4:
                msg = "Quarta-Feira";
                break;
            case 5:
                msg = "Quinta-Feira";
                break;
            case 6:
                msg = "Sexta-Feira";
                break;
            case 7:
                msg = "Sábado";
                break;
            default:
                msg = "Opção Inválida";
                break;
        }

        JOptionPane.showMessageDialog(null, msg,
                "Aula de Java", JOptionPane.INFORMATION_MESSAGE);
    }
}
