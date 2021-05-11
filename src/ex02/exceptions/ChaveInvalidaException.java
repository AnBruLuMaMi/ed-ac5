package ex02.exceptions;

public class ChaveInvalidaException extends RuntimeException {
    public ChaveInvalidaException(String mensagem) {
        super(mensagem);
    }
}
