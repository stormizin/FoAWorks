/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import javax.swing.JOptionPane;

/**
 *
 * @author 201110476
 */
public class Metodos {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();

        double a = Double.parseDouble(
                metodo.lerDados("Entre com o 1° valor: ").replace(".0", ""));

        double b = Double.parseDouble(
                metodo.lerDados("Entre com o 2° valor: "));

        metodo.mostrarDados("" + a + " + " + b + "  =  " +
                (metodo.somar(a, b)+"").replace(".0", ""));
    }

    public String lerDados(String msg) {
        return JOptionPane.showInputDialog(null, msg,
                "Aula de Java", JOptionPane.QUESTION_MESSAGE);
    }

    public void mostrarDados(String msg) {
        JOptionPane.showMessageDialog(null, msg,
                "Aula de Java", JOptionPane.INFORMATION_MESSAGE);
    }

    public double somar(double a, double b) {
        return a + b;
    }
}
