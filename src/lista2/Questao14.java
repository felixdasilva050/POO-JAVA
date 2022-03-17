package lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> anoEdicao = new ArrayList<>();
        List<Integer> numPagina = new ArrayList<>();
        List<String>  titulo    = new ArrayList<>();
        List<Double>  preco     = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("digite ano");
            anoEdicao.add(i , sc.nextInt());
            System.out.println("digite numero de pagina");
            numPagina.add(i , sc.nextInt());
            System.out.println("digite o titulo");
            titulo.add(i , sc.next());
            System.out.println("digite o preço");
            preco.add(i , sc.nextDouble());
        }

        Integer indice = numPagina.indexOf(Collections.max(numPagina));
        System.out.printf("O título de maior página  é: %s, " +
                "do ano %d " +
                "com o total de páginas %d " +
                "no valor de %2f", titulo.get(indice), anoEdicao.get(indice), numPagina.get(indice), preco.get(indice)
        );

    }
}
