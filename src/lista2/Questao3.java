package lista2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros1[] = new int[5];
        int numeros2[] = new int[5];
        int intersecao[] = new int[5];

        for (int i = 0; i < numeros1.length; i++) {
            System.out.println("digite um número inteiro para o primeiro array ai, vá: ");
            numeros1[i] = sc.nextInt();
            System.out.println("digite um número inteiro para o segundo array ai, vá: ");
            numeros2[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros1.length; i++) {
            if (numeros1[i]==numeros2[i]){
                intersecao[i] = numeros1[i];
                System.out.print(intersecao[i]+",");
            }
        }

    }
}
