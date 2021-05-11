package ex02.exceptions;

public class ListaVaziaException extends RuntimeException {
    public ListaVaziaException(String mensagem) {
        super(mensagem);
    }
}