package lista2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc    = new Scanner(System.in);
        int valores[] = new int[10];
        int serolav[] = new int[10]; //hehehehe valores inverso
        System.out.println("adiciona o valor aí, fera! ");
        int valor = sc.nextInt();
        int soma  = 0;
        int maiorP = 0, aux, maiorI = 0;
        int media;

        for (int i = 0; i < valores.length; i++) {

            if (valor>=0){
                valores[i] = valor;
                System.out.println("adiciona o valor aí, fera! " + "(valor de i= " +i+")");
                valor = sc.nextInt();
            } else {
                i = (i > 0 && valores[i-1] > 0 ? i-1 : 0);
                System.out.println("digite um valor inteiro positivo: (valor de i= " +i+")");
                valor = sc.nextInt();
            }
        }

        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
            //MAIOR ELEMENTO PAR
            aux = valores[i];
            if (maiorP < aux && aux % 2 == 0) {
                maiorP = valores[i];
                //MAIOR ELEMENTO IMPAR
            }
            if (maiorI < aux && (aux%2 != 0)){
                maiorI = valores[i];
            }
        }
        System.out.printf("O maior elemento par é: %d \nO menor elemento impar é: %d \n", maiorP, maiorI); // letra B & C

        media = soma/(valores.length);
        System.out.println("Valor da soma, papito: " + soma); // letra D
        System.out.println("A média papitoooooo: " + media); // letra E
        System.out.println("Elemento da posição 3: " + valores[3] + ", Elemento da posição 7: " + valores[7]); // letra F
        soma = valores[4]+valores[8];
        System.out.println("Soma dos elementos da posição 4 e 8: " + soma); // letra G
        if (valores[5]%valores[9] == 0){ // letra H
            System.out.println("O número " + valores[5] + " é múltiplo do valor " +  valores[9]);

        } else {
            System.out.println("O número " + valores[5] + " não é múltiplo do valor " +  valores[9]);
        }
        int j=0;
        for (int i = 9; i >= 0; i--) { // letra I
                serolav[j] = valores[i];
                j++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(serolav[i]);
        }
    }
}
