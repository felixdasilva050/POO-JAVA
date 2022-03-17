package lista2;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int matrix[][] = new int[3][3];
        for ( int i = 0; i < matrix[i].length; i++){
            for ( int j = 0; j < matrix[j].length; i++){
                System.out.println("Informe o elemento: ");
                System.out.println("posição atual de i: " + i +" posião de j: " + j);
                matrix[j][i] = sc.nextInt();
                if ( i == matrix.length){

                    i = 0;
                    j++;
                }
            }
        }
    }
}
