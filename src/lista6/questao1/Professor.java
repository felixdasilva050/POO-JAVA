package lista6.questao1;

public class Professor extends Funcionario {
    public double getSalarioProfessor(){
        return (getSalarioPrimeiraParcela() + getSalarioSegundaParcela());
    }
}
