package ex02.interfaces;


public interface INodoArvoreBinaria<T> extends INodo<T> {
    T element();
    void setElement(T elemento);
    INodoArvoreBinaria<T> getLeft();
    void setLeft(INodoArvoreBinaria<T> nodo);
    INodoArvoreBinaria<T> getRight();
    void setRight(INodoArvoreBinaria<T> nodo);
    INodoArvoreBinaria<T> getParent();
    void setParent(INodoArvoreBinaria<T> nodo);
}
