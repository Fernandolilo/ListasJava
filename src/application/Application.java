package application;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
        System.out.println(notas.toString());

        /*
         *  para localizar uma posição dentro da lista estaremos fazendo o uso do indexOf.
         */
        System.out.println("Exiba a posição 5.0: " + notas.indexOf(5d));

        /*
         * Add a lista a nota 8.0 na posição 4
         */

        System.out.println("Add a lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        /*
         * Substitua a nota 5.0 pela nota 6.0
         */

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        /*
         *Para conferir se existe na lista um objeto precisamos fazer uso do contains, o contains retorna um boolean
         * true ou false
         */

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        /*
         * Exiba todos os itens da lista na ordem em que foram inseridos.
         */
        System.out.println("Exiba todos os itens da lista na ordem em que foram inseridos.");
        for (Double nota : notas) {
            System.out.println(nota);
        }
        /*
         * Exiba a terceira nota ADD para isto faremos o uso do get.
         */
        System.out.println("Exiba a terceira nota ADD: " + notas.get(2));
        System.out.println(notas.toString());

        /*
         * Para exibir a menor e maior nota faremos o uso do colecttions...
         */

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        /*
         *  Para efetuar a soma dos valores, no caso das listas não exite um metodo SUM,
         * para tanto faremos o uso do iterator, o mesmo fara este tratamento.
         */
        System.out.println("Exiba a soma das notas: ");
        Iterator<Double> iterator = notas.iterator();

        /*
         * precisamos efetuar um metodo de enquanto, o mesmo ira verifica sempre o iterator e proximo, guardando assim este valor,
         * o soma inicializa com zero, cada vez que roda o enquanto, ele efetua uma soma, pegando o volar do iterator.
         */
        Double soma = 0d;
        //o hasNext faz uma pergunta iterator tem proximo? o iterator retorna true,
        while (iterator.hasNext()) {
            // o next aqui pega o valor que o iterator informa e guarda ele.
            Double next = iterator.next();
            // o soma que inicia com valor 0, agora pegou o primeiro valor do iterator, e efetua este loop até que nao haja mais proximo.
            soma += next;
        }
        System.out.println(soma);

        /*
         * Para pegar a media precisamos fazer o uso do size, o mesmo retorna um inteiro, veja o ex: abaixo
         */

        System.out.println("A média da notas é: " +(soma/notas.size()));

        /*
        * Para efetuar um remove, podemos fazer a seuinte forma, notas.remove(0); caso eu passe desta forma irá
        * remover o item na poxição 0 do index.
        *
        * para que eu remova a nota 0 entao eu preciso fazer desta forma notas.remove(0d), acrescentar o d de Double.
        *
        * veja o exemplo a baico.
        */

        System.out.println("A nota 0 foi removida: ");
        notas.remove(0d);
        System.out.println(notas);

        //agora vamos remove o index na posição 0:
        System.out.println("O index na posição  0 foi removido: ");
        System.out.println(notas);
        notas.remove(0);
        System.out.println(notas);

        /*
        * Agora vamos fazer o mesmo processo usando o iterator, para remover dados indexados menores que 7.
        */
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        // o iterator fez a pergunta tem proximo com o hasNext? se tem ele retorna um true e guarda o valor em next
        while (iterator1.hasNext()){
            // o next aqui pegou  o valor do iterator;
            Double next = iterator1.next();
            // como o next esta pegando o valor do iterator, e pergunta agora ao next, é menor que 7?
            if(next < 7){
                // sendo menor que 7 ele remove.
                iterator1.remove();
            }
        }
        System.out.println(notas);

        /*
        * Para apagar a lista temos o metodo CLEAR
        */

        System.out.println("Apague toda a lista");
        System.out.println("A lista ainda não foi apagada: " + notas);
        notas.clear();
        System.out.println(notas);
        // O isEmpty é um boolean por isto ou retorna um true ou false
        System.out.println("COnfira se lista realmente foi apagada: " + notas.isEmpty());
    }

}
