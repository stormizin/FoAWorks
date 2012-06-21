/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author victor's MacBook
 */
public class Exemplo1 {

    public static void main(String[] args) {
        int idade = 0;
        String nome = "";
        boolean aniversario = true;

        nome = JOptionPane.showInputDialog(null, "Qual o seu nome?",
                "Aula de Java", JOptionPane.QUESTION_MESSAGE);

        idade = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Em que ANO você nasceu?",
                    "Aula de Java", JOptionPane.QUESTION_MESSAGE));

        if( JOptionPane.showConfirmDialog(null, "Já fez aniversário este ano?",
                "Aula de Java", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION){
            aniversario = false;
        }else{
            aniversario = true;
        }

        idade = 2012 - idade;
        if(!aniversario){
            idade--;
        }

        JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos.",
                "Aula de Java", JOptionPane.INFORMATION_MESSAGE);
    }

}
