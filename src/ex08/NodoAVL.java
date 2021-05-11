package ex08;

import ex02.NodoArvoreBinaria;
import ex02.interfaces.IEntry;
import ex02.interfaces.INodoArvoreBinaria;

public class NodoAVL<K, V> extends NodoArvoreBinaria<IEntry<K, V>> {
    protected int altura;

    public NodoAVL() {
        super();
    }

    NodoAVL(IEntry<K, V> elemento, INodoArvoreBinaria<IEntry<K, V>> pai, INodoArvoreBinaria<IEntry<K, V>> nodoEsquerda,
            INodoArvoreBinaria<IEntry<K, V>> nodoDireita) {
        super(elemento, pai, nodoEsquerda, nodoDireita);
        altura = 0;

        if (nodoEsquerda != null)
            altura = Math.max(altura, 1 + ((NodoAVL<K, V>) nodoEsquerda).getAltura());

        if (nodoDireita != null)
            altura = Math.max(altura, 1 + ((NodoAVL<K, V>) nodoDireita).getAltura());
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAltura() {
        return altura;
    }
}
