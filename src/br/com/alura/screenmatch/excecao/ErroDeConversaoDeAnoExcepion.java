package br.com.alura.screenmatch.excecao;

public class ErroDeConversaoDeAnoExcepion extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeAnoExcepion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
