package br.com.alura.screenmatch.modelos;

public class Series extends Titulo {
    private int temporadas;
    private boolean avita;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public Series(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAvita() {
        return avita;
    }

    public void setAvita(boolean avita) {
        this.avita = avita;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    /**
     * sobre escreve o metodo da classe principal.
     */
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }
}
