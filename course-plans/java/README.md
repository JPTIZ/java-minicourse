Roteiro
======

1ª Aula: Aula introdutória
--------------------------
1. Introduzir o conceito de programação;
2. Introduzir as características principais da linguagem Java;
3. Introduzir levemente a JVM;
4. Mostrar um Hello World simples;
5. Mostrar o bytecode gerado (`javap -c`);
6. Explicar a respeito da execução feita pela JVM;
7. Mostrar que a execução ocorre em sequência;
8. Enunciar problema: "como lembrar valores?";
9. Mostrar solução: Variáveis (`type name`);
10. Enunciar problema: "como definir diferentes fluxos para o programa?";
11. Mostrar solução: Estruturas condicionais (`if`);
12. Ampliar solução: Encadeamento de estruturas (`if-else`).

2ª Aula: Laços de repetição e Arrays
------------------------------------
1. Enunciar problema: "como repetir a mesma ação até atingir uma condição?"
2. Mostrar solução: Laços de repetição (`while`);
3. Enunciar problema: "como repetir a mesma ação x vezes?";
4. Mostrar solução: Laços de repetição (`for`);
5. Enunciar problema: "como armazenar uma lista de valores?";
6. Mostrar solução: Raw-arrays (`type[] name`);
7. Explicar a respeito de escopo;
8. Explicar sobre matrizes;
9. Explicar sobre "cache-friendliness".

3ª Aula: Classes, objetos e métodos
-----------------------------------
1. Enunciar problema: "como definir meu próprio tipo?";
2. Mostrar solução: Tipos definidos por usuário (pt.1) - Classes (`class Type`)
   e objetos (`new Type(...)`);
3. Explicar a respeito de atributos;
4. Explicar a respeito de alocação de memória na JVM;
5. Explicar sobre Garbage-Collection (mostrar pequeno paralelo com C/tempo de
   vida determinístico -- não perder muito tempo nisso);
6. Resolver exercício com os alunos;
7. Deixar alunos resolverem um exercício, posteriormente mostrando a solução;
8. Fazer pequeno e simples exemplo mostrando elementos estáticos.

4ª Aula: Introdução a Algoritmos
--------------------------------
1. Enunciar problema: Busca em uma lista;
2. Mostrar solução linear - consequentemente explicando sobre métodos estáticos
   com uma classe para operações em Arrays;
3. Mostrar solução O(log(n)) (busca binária);
4. Explicar sobre complexidade e notação assintótica;
5. Enunciar problema: Ordenar uma lista;
6. Deixar alunos pensarem numa forma de resolver;
7. Mostrar resolução: Busca binária (enunciar ineficiência);
8. (Se sobrar tempo) Enunciar e resolver problema: inverter uma lista.

5ª Aula: Métodos, funções e procedimentos
-----------------------------------------
1. Explicar referência e cópia;
2. Explicar sobre depuração de código;
3. Explicar que nem todo atributo possui get/set (até porque não é dessa forma
   que se modela);
4. Explicar que API > implementação;
5. Explicar sobre assinatura de função.
