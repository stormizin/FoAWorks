/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho02.exercicio04;

import java.util.ArrayList;

/**
 *
 * @author victor's MacBook
 */
public class CD {

    private String titulo;
    private String genero;
    private int anoLancamento;
    private String interprete;
    private ArrayList<Faixa> faixas = new ArrayList<Faixa>();//

    /*
     * GETS
     */
    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public String getInterprete() {
        return interprete;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<Faixa> getFaixas() {
        return faixas;
    }

    /*
     * SETS
     */
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void addFaixa(Faixa faixa) {
        this.faixas.add(faixa);
    }
}
