package br.com.alura.screenmetch.modelos;

import br.com.alura.screenmetch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacaos;
    private int totalDeAvaliacaos;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDelancamento) {
        this.nome = nome;
        this.anoDelancamento = anoDelancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Nao consegui converter o Ano");


        }
        this.anoDelancamento =Integer.valueOf( meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));

    }

    public int getTotalDeAvaliacaos() {
        return totalDeAvaliacaos;
    }

    public String getNome() {

        return nome;
    }

    public int getAnoDelancamento() {

        return anoDelancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibiFichaTecnica() {
        System.out.println("Nome do filme" + nome);
        System.out.println("Ano do filme" + anoDelancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacaos += nota;
        totalDeAvaliacaos++;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome  = '" + nome  + ", anoDeLancamento = " + anoDelancamento + " , " +
                " duração = " + duracaoEmMinutos + ")";
    }
}
