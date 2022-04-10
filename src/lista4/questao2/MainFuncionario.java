package lista4.questao2;

import java.util.Set;

public class MainFuncionario {
    public static void main(String[] args) {

        Setor setor1 = new Setor("Back-end developer");
        Setor setor2 = new Setor("Front-end Developer");
        Setor setor3 = new Setor("QA");

        Funcionario funcionario1 = new Funcionario("fun1", 30, 5000.00, setor1);
        Funcionario funcionario2 = new Funcionario("fun2", 32, 3300.00, setor2);
        Funcionario funcionario3 = new Funcionario("fun3", 35, 3500.00, setor3);

    }
}
