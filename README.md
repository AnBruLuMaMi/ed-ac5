## Membros do Grupo   

| Nome                            | RA |
|--------------------------------|--------- |
| André Lucas Fabbris de Toledo   | 1902777 |
| Bruno Alkimim de Negreiros      | 1902646 |
| Lucas de Alencar Silva          | 1902989 |
| Mariana Rodrigues Zubi da Silva | 1904204 |
| Milena Bispo Gomes              | 1904052 |
    
# AC5 - Estrutura de Dados
1. Implemente e teste o TAD conforme os slides 9 a 15.<br>***R:** /tests/ex01.test*
2. Implemente e teste o TAD-Mapa Ordenado - Árvore Binária de Busca (slides de
21 a 27).<br>***R:** /tests/ex02.test*
3. Inserindo-se as entradas (1,A), (2,B), (3,C), (4,D) e (5,E), nessa ordem, em uma
árvore de pesquisa binária inicialmente vazia, qual será sua aparência?<br>***R:***<br><img src="https://github.com/AnBruLuMaMi/ed-ac5/blob/main/imgs/ex3.png" alt="drawing" width="250"/> 
4. Define-se uma árvore binária de pesquisa em que as chaves iguais à chave do
nodo podem estar ou à esquerda ou à direita da subárvore deste nodo. Suponha
que se altere a definição na qual restringimos chaves iguais na subárvore à
direita. Qual seria a subárvore de uma árvore binária de pesquisa que contenha
somente chaves iguais, como visto neste caso?<br>***R:** Neste caso, se todos os nodos tivessem chaves iguais então não haveria nenhuma subárvore com nodo a esquerda.*
5. Insira, em uma árvore binária de pesquisa vazia, itens com as chaves 30, 40, 24,
58, 48, 26, 11, 13 (nesta ordem). Desenhe a árvore após cada inserção.<br>***R:***<br><img src="https://github.com/AnBruLuMaMi/ed-ac5/blob/main/imgs/ex5.png" alt="drawing" width="250"/> 
6. Quantas árvores binárias de pesquisas diferentes podem armazenar as chaves
{1,2,3}?.<br>***R:** Alternando a ordem que insere as chaves poderá gerar até 5 árvores distintas.*
7. O professor Amongus afirma que a ordem na qual um conjunto fixo de itens é
inserido em uma árvore binária de pesquisa não interessa — sempre resulta na
mesma árvore. Apresente um pequeno exemplo que prove que ele está errado.<br>***R:** Como demonstrado no exercício anterior, se inserirmos o conjunto de números {1, 2, 3} em uma árvore binária de busca e for alternando a ordem teremos árvores distintas. Exemplo:* <br><img src="https://github.com/AnBruLuMaMi/ed-ac5/blob/main/imgs/ex7.png" alt="drawing" width="250"/> 
8. Implemente e teste o TAD-Mapa Ordenado - AVL (slides de 30 a 35).<br>***R:** /tests/ex08.test*
9. Inserindo-se as entradas (1,A), (2,B), (3,C), (4,D) e (5,E), nessa ordem, em
uma árvore AVL inicialmente vazia, qual será sua aparência?<br>***R:***<br><img src="https://github.com/AnBruLuMaMi/ed-ac5/blob/main/imgs/ex9.png" alt="drawing" width="250"/> 
10. O professor Amongus afirma que a ordem na qual um conjunto fixo de itens é
inserido em uma árvore AVL não interessa — sempre resulta na mesma árvore.
Apresente um pequeno exemplo que prove que ele está errado.<br>***R:** Se inserirmos a sequência do exercício anterior ao contrário, ou seja na ordem {5,4,3,2,1}, teremos uma árvore diferente da vista no exercício anterior, refutando a afirmação do Amongus. Conforme a imagem:* <br><img src="https://github.com/AnBruLuMaMi/ed-ac5/blob/main/imgs/ex10.png" alt="drawing" width="250"/> 
11. Desenhe a árvore AVL resultante da inserção de um elemento com chave 52 na
árvore AVL abaixo.<br>***R:***<br><img src="https://github.com/AnBruLuMaMi/ed-ac5/blob/main/imgs/ex11.png" alt="drawing" width="250"/> 
12. Desenhe a árvore AVL resultante da remoção de um elemento com chave 62 na
árvore AVL após a inserção da chave 52 na árvore AVL abaixo.<br>***R:***<br><img src="https://github.com/AnBruLuMaMi/ed-ac5/blob/main/imgs/ex12.png" alt="drawing" width="250"/> 
