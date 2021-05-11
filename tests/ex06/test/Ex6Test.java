package ex06.test;

import ex02.MapaOrdenado;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex6Test {
    @Test
    void test() {
        //R: Alternando a ordem que insere as chaves poderá gerar até 5 árvores distintas.

        MapaOrdenado<Integer, Integer> A1, A2, A3, A4, A5, A6;
        HashSet<String> list = new HashSet<>();

        A1 = new MapaOrdenado<>();
        A2 = new MapaOrdenado<>();
        A3 = new MapaOrdenado<>();
        A4 = new MapaOrdenado<>();
        A5 = new MapaOrdenado<>();
        A6 = new MapaOrdenado<>();

        A1.put(1, null);
        A1.put(2, null);
        A1.put(3, null);

        A2.put(1, null);
        A2.put(3, null);
        A2.put(2, null);

        A3.put(2, null);
        A3.put(1, null);
        A3.put(3, null);

        A4.put(2, null);
        A4.put(3, null);
        A4.put(1, null);

        A5.put(3, null);
        A5.put(1, null);
        A5.put(2, null);

        A6.put(3, null);
        A6.put(2, null);
        A6.put(1, null);

        list.add(A1.printExpression(A1.root()));
        list.add(A2.printExpression(A2.root()));
        list.add(A3.printExpression(A3.root()));
        list.add(A4.printExpression(A4.root()));
        list.add(A5.printExpression(A5.root()));
        list.add(A6.printExpression(A6.root()));

        assertEquals(5, list.size());
    }
}
