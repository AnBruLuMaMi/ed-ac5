package ex02.interfaces;

import ex02.exceptions.LimiteVioladoException;
import ex02.exceptions.NodoInvalidoException;

public interface IArvoreBinaria<T> extends IArvore<T> {
    INodo<T> left(INodo<T> nodo) throws NodoInvalidoException, LimiteVioladoException;
    INodo<T> right(INodo<T> nodo) throws NodoInvalidoException, LimiteVioladoException;
    boolean hasLeft(INodo<T> nodo) throws NodoInvalidoException;
    boolean hasRight(INodo<T> nodo) throws NodoInvalidoException;
}
