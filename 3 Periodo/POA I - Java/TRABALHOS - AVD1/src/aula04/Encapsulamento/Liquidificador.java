/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.Encapsulamento;

import aula04.Metodos;
import javax.swing.JOptionPane;

/**
 *
 * @author 201110476
 */
public class Liquidificador {

    Motor motor = new Motor();
    Metodos metodo = new Metodos();

    public static void main(String[] args) {
        Liquidificador liquid = new Liquidificador();

        int op = 0;
        do {
            op = liquid.menu();
            switch (op) {
                case 1:
                    liquid.aumentaVelocidade();
                    break;
                case 2:
                    liquid.diminuirVelocidade();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "" + liquid.mostrarVelocidade(),
                            "Liquidificador 9000+", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    liquid.botaoF();
                    break;
                case 5:
                    liquid.desligar();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida",
                            "Liquidificador 9000+", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (op != 5);
    }

    public void aumentaVelocidade() {
        motor.setVelocidade(motor.getVelocidade() + 1);
    }

    public void diminuirVelocidade() {
        motor.setVelocidade(motor.getVelocidade() - 1);
    }

    public int mostrarVelocidade() {
        return motor.getVelocidade();
    }

    public void desligar() {
        System.exit(0);
    }

    public void botaoF() {
        motor.setVelocidade(0);
    }

    public int menu() {
        String msg = "Escolha uma opção:\n\n";
        msg += ""
                + "1 - Aumentar Velocidade\n"
                + "2 - Diminuir Velocidade\n"
                + "3 - Mostrar Velocidade\n"
                + "4 - Botão F...\n"
                + "5 - Desligar";

        return Integer.parseInt(JOptionPane.showInputDialog(null, msg,
                "Liquidificador 9000+", JOptionPane.QUESTION_MESSAGE));
    }
}
