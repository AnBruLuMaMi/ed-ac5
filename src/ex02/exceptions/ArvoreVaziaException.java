package ex02.exceptions;

public class ArvoreVaziaException extends RuntimeException {
    public ArvoreVaziaException(String mensagem) {
        super(mensagem);
    }
}
