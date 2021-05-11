package ex02;

import ex02.interfaces.IEntry;

public class Entry<K, V> implements IEntry<K, V> {
    protected K chave;
    protected V valor;

    public Entry(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getKey() { return chave; }
    public V getValue() { return valor; }
    public String toString() { return "(" + chave + "," + valor + ")"; }
}
