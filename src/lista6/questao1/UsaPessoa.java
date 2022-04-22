package lista6.questao1;

public class UsaPessoa {
    public static void main(String[] args) {
        Pessoa pessoaP = new Pessoa("José", "Manoel");
        Funcionario pessoaFunc = new Funcionario();
        Professor pessoaProf = new Professor();

        pessoaFunc.setNome("Leandro");
        pessoaFunc.setSobrenome("Charles");
        pessoaFunc.setSalario(2000.00);

        pessoaProf.setNome("Rita");
        pessoaProf.setSobrenome("Cássia");
        pessoaProf.setSalario(500.00);

        System.out.println(pessoaP.getNomeCompleto());

        System.out.println(pessoaFunc.getNomeCompleto());
        System.out.println("Salário Funcionário:" + pessoaFunc.getSalarioPrimeiraParcela() + " " + pessoaFunc.getSalarioSegundaParcela());

        System.out.println(pessoaProf.getNomeCompleto());
        System.out.println("Salário PROF.:" + " " + pessoaProf.getSalarioProfessor());
    }
}
