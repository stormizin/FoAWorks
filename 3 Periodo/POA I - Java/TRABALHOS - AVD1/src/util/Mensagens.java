/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JOptionPane;

/**
 *
 * @author victor's MacBook
 */
public class Mensagens {

    private String titulo = "SI-UniFOA: 3° Periodo - Aula de Java";
    private int information = JOptionPane.INFORMATION_MESSAGE;
    private int question = JOptionPane.QUESTION_MESSAGE;
    private int error = JOptionPane.ERROR_MESSAGE;
    private int warning = JOptionPane.WARNING_MESSAGE;

    public int Error() {
        return error;
    }

    public int Information() {
        return information;
    }

    public int Question() {
        return question;
    }

    public String Titulo() {
        return titulo;
    }

    public int Warning() {
        return warning;
    }

    public void show(String msg, int icon) {
        JOptionPane.showMessageDialog(null, msg, titulo, icon);
    }

    public String get(String msg, int icon) {
        return JOptionPane.showInputDialog(null, msg, titulo, icon);
    }
}
