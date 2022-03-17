package lista2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[10][10];

        System.out.println("Entre com os valores da matriz: ");

        int i, j;
        for (i = 0; i < matriz.length; i++)
            for (j = 0; j < matriz.length; j++) {
                System.out.printf("Informe o elemento [%d][%d}: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++)
                if (i != j) {
                    System.out.printf("%d ", matriz[i][j]);
                }
        }
    }
}
