package lista4.questao2;

public class Funcionario {
    private static Integer matriculaFunc = 0;
    private String nome;
    private Integer idade;
    private Double salario;
    private Setor setor;
    Funcionario(String nome,Integer idade,Double salario, Setor setor){
        matriculaFunc++;
        System.out.printf("Matrícula: %d | Nome: %s | Idade: %d | Salário: %.2f | Setor: %d %s| \n", matriculaFunc, nome, idade, salario,setor.getCodigoSetor() ,setor.getNome());
    }

}
