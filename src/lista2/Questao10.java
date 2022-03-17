package lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Questao7 questao7 = new Questao7();
        Scanner sc        = new Scanner(System.in);
        Integer nConta    = sc.nextInt();
        String somaConta  = String.valueOf(nConta + (questao7.invertido(nConta)));
        char[] numerosSeparados = somaConta.toCharArray();
        Integer valor     = 0;
        List<Integer> multiplicaPosicao = new ArrayList<>();
        int numero = 1;
        for (int i = 0; i < numerosSeparados.length; i++) {
            Integer numeroSeparadoConvertido = Integer.parseInt(String.valueOf(numerosSeparados[i]));
            valor = valor + (numero*numeroSeparadoConvertido);
            numero++;
        }
        Integer digito = valor%10;
        System.out.printf("valor numero da conta com o digito: %d-%d",nConta, digito);
    }
}
