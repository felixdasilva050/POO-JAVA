package lista2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner sc     = new Scanner(System.in);
        System.out.println("digita o valor ai, na moral: ");
        Double valor1 = sc.nextDouble();
        System.out.println("qual metodo quer usar " +
                "\n [1] metodo WHILE " +
                "\n [2] metodo DO WHILE" +
                "\n [3] metodo FOR"
        );
        Integer codigo= sc.nextInt();
        switch (codigo){
            case 1:
                metodoEnquanto(valor1);
                break;
            case 2:
                metodoFacaEnquanto(valor1);
                break;
            case 3:
                System.out.println(metodoFor(valor1));
                break;
            default:
                System.out.println("você não digitou um código válido");
        }
    }

    public static void metodoEnquanto(Double a){
        Double resultado;
        Integer contador = 1;
        System.out.println(":::::Com o While:::::");
        while (contador<=10){
            resultado = contador*a;
            System.out.println(contador + " X " + a +" = "  +resultado);
            contador++;
        }

    }
    public static void metodoFacaEnquanto(Double a){
        Double resultado;
        Integer contador = 1;
        System.out.println(":::::Com do While:::::");
        do {
            resultado = contador*a;
            System.out.println(contador + " X " + a +" = "  +resultado);
            contador++;
        }while (contador <= 10);

    }

    public static String metodoFor(Double a){
        Double resultado;
        System.out.println(":::::Com o for:::::");
        List<String> resultados=new ArrayList<>();
        int indice = 0;
        for (int i = 1; i <=10 ; i++) {
            resultado = i*a;
            resultados.add(indice, i + " X "+ a + " = " + resultado + "\n");
            indice++;
        }
        return resultados.toString();
    }

}
