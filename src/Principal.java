import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibiFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de Avaliaçõe %d: ".formatted(meuFilme.getTotalAvaliacoes()));
        System.out.println(meuFilme.pegaMedia());

        System.out.println("================================================================");

        Series lost = new Series("Lost", 2000);
        lost.exibiFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração em minuto para maratonar Lost: "+lost.getDuracaoEmMinutos());

        System.out.println("================================================================");

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("================================================================");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        System.out.println("================================================================");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(lost);

        System.out.println("Tamanho da lista:" + listaDeFilmes.size());
        System.out.println("Primeiro filme:"+ listaDeFilmes.get(0));

        System.out.println(listaDeFilmes);


    }
}