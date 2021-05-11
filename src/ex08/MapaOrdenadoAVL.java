package ex08;

import ex02.MapaOrdenado;
import ex02.exceptions.ChaveInvalidaException;
import ex02.interfaces.IEntry;
import ex02.interfaces.IMapa;
import ex02.interfaces.INodo;
import ex02.interfaces.INodoArvoreBinaria;

import java.util.Comparator;

public class MapaOrdenadoAVL<K,V> extends MapaOrdenado<K,V> implements IMapa<K,V> {
    public MapaOrdenadoAVL() {
        super();
    }

    public MapaOrdenadoAVL(Comparator<K> comparador) {
        super(comparador);
    }

    private int height(INodo<IEntry<K, V>> nodo) {
        return ((NodoAVL<K, V>) nodo).getAltura();
    }

    private void setHeight(INodo<IEntry<K, V>> nodo) {
        ((NodoAVL<K, V>) nodo).setAltura(1 + Math.max(height(left(nodo)), height(right(nodo))));
    }

    private boolean isBalanced(INodo<IEntry<K, V>> p) {
        int bf = height(left(p)) - height(right(p));
        return ((-1 <= bf) && (bf <= 1));
    }

    private INodo<IEntry<K, V>> tallerChild(INodo<IEntry<K, V>> nodo) {
        if (height(left(nodo)) > height(right(nodo)))
            return left(nodo);
        else if (height(left(nodo)) < height(right(nodo)))
            return right(nodo);

        if (isRoot(nodo))
            return left(nodo);

        if (nodo == left(parent(nodo)))
            return left(nodo);
        else
            return right(nodo);
    }

    private void rebalance(INodo<IEntry<K, V>> zNodo) {
        if (isInternal(zNodo))
            setHeight(zNodo);

        while (!isRoot(zNodo)) {
            zNodo = parent(zNodo);
            setHeight(zNodo);

            if (!isBalanced(zNodo)) {
                INodo<IEntry<K, V>> xPos = tallerChild(tallerChild(zNodo));
                zNodo = restructure(xPos);

                setHeight(left(zNodo));
                setHeight(right(zNodo));
                setHeight(zNodo);
            }
        }
    }

    @Override
    protected INodoArvoreBinaria<IEntry<K, V>> criarNodo(IEntry<K, V> elemento, INodoArvoreBinaria<IEntry<K, V>> pai,
                                                         INodoArvoreBinaria<IEntry<K, V>> nodoEsquerda, INodoArvoreBinaria<IEntry<K, V>> nodoDireita) {
        return new NodoAVL<>(elemento, pai, nodoEsquerda, nodoDireita);
    }

    @Override
    public V put(K chave, V valor) throws ChaveInvalidaException {
        V toReturn = super.put(chave, valor);

        rebalance(actionPos);

        return toReturn;
    }

    @Override
    public V remove(K chave) throws ChaveInvalidaException {
        V toReturn = super.remove(chave);

        if (toReturn != null)
            rebalance(actionPos);

        return toReturn;
    }
}
