package lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> codProduto  = new ArrayList<>();
        List<String> nomeProduto  = new ArrayList<>();
        List<Double> precoProduto = new ArrayList<>();
        List<Double> descontoProduto = new ArrayList<>();
        Double mediaPrecoSemDesconto = 0.0;
        Double mediaPrecoComDesconto = 0.0;

        for (int i = 0; i < 2; i++) {
            System.out.println("qual é o código do produto? ");
            codProduto.add(i , sc.nextInt());
            System.out.println("qual é o nome do produto? ");
            nomeProduto.add(i , sc.next());
            System.out.println("qual é o preço do produto? ");
            precoProduto.add(i , sc.nextDouble());
            System.out.println("qual é o desconto do produto? (sem o sinal % apenas o número. 0 para nenhum desconto)");
            descontoProduto.add(i , sc.nextDouble());
            mediaPrecoSemDesconto += precoProduto.get(i);
            mediaPrecoComDesconto += precoProduto.get(i)-(descontoProduto.get(i)*0.01);

        }

        for (int i = 0; i < nomeProduto.size(); i++) {
            System.out.printf("Código do produto: %d, nome do produto: %s, preço do produto: %.2f, %.2f porcento de desconto\n",
                    codProduto.get(i), nomeProduto.get(i), precoProduto.get(i), descontoProduto.get(i));

        }

        mediaPrecoSemDesconto = mediaPrecoSemDesconto/(precoProduto.size());
        mediaPrecoComDesconto = mediaPrecoComDesconto/(precoProduto.size());
//        teste

        System.out.printf("A média de preço sem desconto é: %.2f.\nA média de preço com desconto é: %.2f.",mediaPrecoSemDesconto, mediaPrecoComDesconto);


    }

}
