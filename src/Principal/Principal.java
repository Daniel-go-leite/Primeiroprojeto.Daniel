package Principal;

import br.com.alura.screenmeatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmeatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmetch.modelos.Documentario;
import br.com.alura.screenmetch.modelos.Episodio;
import br.com.alura.screenmetch.modelos.Filme;
import br.com.alura.screenmetch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Documentario documentario = new Documentario("A Terra", 2023);
        documentario.setDuracaoEmMinutos(120);

        documentario.exibiFichaTecnica();
        documentario.avalia(9);
        documentario.avalia(10);
        documentario.avalia(8);

        Documentario documentario1 = new Documentario("O Fim", 2023);
        documentario1.setDuracaoEmMinutos(110);

        documentario1.exibiFichaTecnica();
        documentario1.avalia(10);
        documentario1.avalia(9.7);
        documentario1.avalia(9);

        Documentario documentario2 = new Documentario("Planeta", 2023);
        documentario2.setDuracaoEmMinutos(130);

        documentario2.avalia(9);
        documentario2.avalia(10);
        documentario2.avalia(8);



        Filme meuFilme = new Filme("O filme" , 2023);
        meuFilme.setAnoDelancamento(2023);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(9.6);



        Serie lOST = new Serie("lost" ,2000 );
        lOST.exibiFichaTecnica();
        lOST.setEpisodiosPorTemporada(10);
        lOST.setTemporadas(10);
        lOST.setMinutosPorEpisodio(50);



        System.out.println("Duração para maratonar lost:" + lOST.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar" , 2020);
        outroFilme.setAnoDelancamento(2020);
        outroFilme.setDuracaoEmMinutos(195);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(documentario);
        calculadora.inclui(documentario1);
        calculadora.inclui(documentario2);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lOST);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);


        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lOST);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDodaniel = new Filme("O Dia D " , 78);
        filmeDodaniel.setDuracaoEmMinutos(200);
        filmeDodaniel.setAnoDelancamento(78);
        filmeDodaniel.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDodaniel);


        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println(("Primeiro filme  " + listaDeFilmes.get(0).getNome()));
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        ArrayList<Documentario>listaDeDocumentarios = new ArrayList<>();
        listaDeDocumentarios.add(documentario);
        listaDeDocumentarios.add(documentario1);
        listaDeDocumentarios.add(documentario2);

        System.out.println("Tamanho da lista " + listaDeDocumentarios.size() );
        System.out.println(("primeiro documentario" + listaDeDocumentarios.get(0).getTema()));
        System.out.println(listaDeDocumentarios);
        System.out.println("toString do documentario" + listaDeDocumentarios.get(0).getTema());





    }


}