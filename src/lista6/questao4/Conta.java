package lista6.questao4;

public class Conta {
    private double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if(saldo <= 0 ){
            System.out.println("tá liso, meu chegado!");
        } else {
            saldo -= valor;
        }
    }
}
