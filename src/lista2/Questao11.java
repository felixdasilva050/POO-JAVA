package lista2;
import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        // OKAY
        Scanner input = new Scanner (System.in);
        char letra;
        System.out.println("DIGITE UMA LETRA DO ALFABETO: ");
        letra = input.next().charAt(0);

        switch (letra) {
            case 'a':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'e':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'i':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'o':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'u':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'A':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'E':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'I':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'O':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            case 'U':
                System.out.println("A LETRA DIGITADA FOI A VOGAL: " + letra);
                break;
            default:
                System.out.println("A LETRA DIGITADA FOI A CONSOANTE: " + letra);


        }

    }
}