package br.com.alura.screenmetch.modelos;

import br.com.alura.screenmeatch.calculo.Classificavel;

public class Documentario extends Titulo implements Classificavel {

   private String Tema;


    public Documentario(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);
    }



    public String getTema(){
        return Tema;
    }

    public void setTema(String tema){
        Tema = tema;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    private int pegaMedia(){
        return 0;
    }

    @Override
    public String toString() {
        return "Documentario  " + getNome() + "(" + this.getAnoDelancamento()+")";

    }
}
