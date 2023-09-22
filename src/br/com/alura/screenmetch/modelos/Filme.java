package br.com.alura.screenmetch.modelos;

import br.com.alura.screenmeatch.calculo.Classificavel;

public class Filme extends  Titulo implements Classificavel {

    private String Diretor;

    public Filme(String nome, int anoDelancamento){

        super(nome, anoDelancamento);
    }

    public String getDiretor() {

        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    @Override
    public int getClassificacao() {

        return (int) pegaMedia() /2;
    }

    private int pegaMedia() {
        return 0;
    }


    @Override
    public String toString() {

        return "Filme " + this.getNome() + "(" + this.getAnoDelancamento() + " )";
    }
}