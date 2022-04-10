package lista4.questao1;

public class Funcionario {
    public static Integer matriculaFunc = 0;
    public String nome;
    public Integer idade;
    public Double salario;

    Funcionario(String nome,Integer idade,Double salario){
        matriculaFunc++;
        System.out.printf("Matrícula: %d | Nome: %s | Idade: %d | Salário: %.2f | \n", matriculaFunc, nome, idade, salario);
    }

}
