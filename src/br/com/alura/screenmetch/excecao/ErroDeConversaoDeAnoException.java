package br.com.alura.screenmetch.excecao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String Mensagem;
    public ErroDeConversaoDeAnoException(String Mensagem) {
        this.Mensagem = Mensagem;
    }

    @Override
    public String getMessage() {
        return this.Mensagem;
    }
}
