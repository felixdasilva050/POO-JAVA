package lista3;

import java.util.Scanner;

public class PessoaTeste {

    public static void main(String[] args) {
        q1 pessoa = new q1();
        String nome;
        Integer idade;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual seu nome?: ");
        pessoa.setNome(sc.next());

        System.out.println("Qual a sua idade?: ");
        pessoa.setIdade(sc.nextInt());



        System.out.println(pessoa.toString());
    }
}
