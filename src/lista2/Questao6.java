package lista2;

/*Escreva uma classe que efetue, a multiplicação entre duas matrizes A e B do tipo (3 x 3) e preencha
uma outra matriz R com o resultado, ou seja R = A * B. */
public class Questao6 {
    public static void main(String[] args) {

//        matriz A { {5, 1, 4}, {7, 3, 5}, {9, 3, 1} }
//        matriz B{ {6, 3, 7 }, {9, 7, 2 }, {8, 2, 9} }

        //MatrizA
        int [][] matrizA = {
                {6, 3, 7 }, {9, 7, 2 },{8, 2, 9}
        };
        int [][] matrizB = {
                {6, 3, 7 },
                {9, 7, 2 },
                {8, 2, 9}
        };


        int [][] resultado = new int[3][3];
        for (int i = 0; i < matrizA.length; i++)
            for (int j = 0; j < matrizA.length; j++) {
                resultado[i][j] = matrizA[i][j] * matrizB[i][j];
                System.out.print(resultado[i][j] + ",");
            }
    }
}
