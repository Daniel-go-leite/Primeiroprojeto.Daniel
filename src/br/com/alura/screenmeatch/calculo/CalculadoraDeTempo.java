package br.com.alura.screenmeatch.calculo;

import br.com.alura.screenmetch.modelos.Filme;
import br.com.alura.screenmetch.modelos.Serie;
import br.com.alura.screenmetch.modelos.Titulo;

import java.time.temporal.Temporal;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {

        return tempoTotal;
    }

  // public void inclui(Filme f) {
  //    this.tempoTotal += f.getDuracaoEmMinutos();
//
//    }
//
//    public void inclui(Serie S) {
//        this.tempoTotal += S.getDuracaoEmMinutos();
//    }

     public void inclui(Titulo titulo){
       System.out.println("Adicionando duracão em minutois de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
     }

}