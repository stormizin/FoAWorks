 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.Encapsulamento;

import javax.swing.JOptionPane;

/**
 *
 * @author 201110476
 */
public class Motor {

    private int velocidade = 0;

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        //TEM QUE VALIDAR A INFORMAÇÃO ANTES DE JOGAR NA VARIÁVEL
        if (velocidade >= 0 && velocidade < 3) {
            this.velocidade = velocidade;
        }
    }
}
