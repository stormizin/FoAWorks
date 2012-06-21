/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho02.exercicio01;

import javax.swing.JOptionPane;
import sun.print.resources.serviceui;
import util.Mensagens;

/**
 *
 * @author victor's MacBook
 */
public class Aluno {

    Mensagens msgs = new Mensagens();
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public boolean setNota1(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.nota1 = nota;
            return true;
        } else {
            return false;
        }
    }

    public boolean setNota2(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.nota2 = nota;
            return true;
        } else {
            return false;
        }
    }

    public boolean setNota3(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.nota3 = nota;
            return true;
        } else {
            return false;
        }
    }

    public boolean setNota4(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            this.nota4 = nota;
            return true;
        } else {
            return false;
        }
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public double getNota4() {
        return this.nota4;
    }

    public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public String lerNome(String msg) {
        return JOptionPane.showInputDialog(null, msg, msgs.Titulo(), msgs.Information());
    }

    public double lerNota(String msg) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, msg, msgs.Titulo(), msgs.Question()));
    }

    public void resultadoFinal(String nome, double mediaAnual) {
        if (mediaAnual < 3.5) {
            msgs.show("Situação final de [" + nome + "] : REPROVADO \n Média: "+mediaAnual, msgs.Error());
        }
        if (mediaAnual >= 3.5 && mediaAnual < 7.0) {
            msgs.show("Situação final de [" + nome + "] : RECUPERAÇÃO \n Média: "+mediaAnual, msgs.Warning());
        }
        if (mediaAnual > 7.0) {
            msgs.show("Situação final de [" + nome + "] : APROVADO \n Média: "+mediaAnual, msgs.Information());
        }
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        String nome = aluno.lerNome("Entre com o [Nome] do Aluno:");
        
        double nota;
        
        do{
            nota = aluno.lerNota("Entre com a [Nota 01]");
        }while(!aluno.setNota1(nota));
        
        do{
            nota = aluno.lerNota("Entre com a [Nota 02]");
        }while(!aluno.setNota2(nota));
        
        do{
            nota = aluno.lerNota("Entre com a [Nota 03]");
        }while(!aluno.setNota3(nota));
        
        do{
            nota = aluno.lerNota("Entre com a [Nota 04]");
        }while(!aluno.setNota4(nota));
        
        double media = aluno.calcularMedia(aluno.getNota1(), aluno.getNota2(), 
                aluno.getNota3(), aluno.getNota4());
        
        aluno.resultadoFinal(nome, media);

    }
}
