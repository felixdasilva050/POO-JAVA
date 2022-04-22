package lista6.questao1;

public class Funcionario extends Pessoa{

    private int matricula;
    private double salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0){
            System.out.println("Salário não pode ser negativo, quer tirar é ?");
        } else {
            this.salario = salario;
        }
    }

    public double getSalarioPrimeiraParcela(){
        double primeiraParcela = 0.4;
        return (salario - (salario * primeiraParcela));
    }

    public double getSalarioSegundaParcela(){
        double segundaParcela = 0.6;
        return  (salario - (salario * segundaParcela));
    }
}

