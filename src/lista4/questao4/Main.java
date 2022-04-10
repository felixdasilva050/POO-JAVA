package lista4.questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita teu CPF, bença: ");
        String numeroCPF = sc.next();
        Cpf cpf = new Cpf();
        cpf.formatarCpf(numeroCPF);
    }
}
