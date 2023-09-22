package Principal;

import br.com.alura.screenmetch.modelos.Filme;
import br.com.alura.screenmetch.modelos.Serie;
import br.com.alura.screenmetch.modelos.Titulo;

import java.util.*;

public class PrincipalComlistas {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("O fime" , 2023);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar" , 2020);
        outroFilme.avalia(6);
        Filme filmeDodaniel = new Filme("O Dia D " , 78);
        filmeDodaniel.avalia(10);
        Serie lOST = new Serie("lost" ,2000 );
        Filme f1 = filmeDodaniel;

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDodaniel);
        lista.add(lOST);

        for (Titulo item:lista) {
            {
                System.out.println(item.getNome());
                if (item instanceof Filme filme && filme.getClassificacao() > 2)

                    System.out.println("Classificação  " + filme.getClassificacao());

            }
        }
        ArrayList<String>buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordem");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados ");

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDelancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
