package lista7;

public class Carro extends Veiculo{
    private Double combustivel;

    public Carro(){}

    public Carro(String chassi, String tipo, Double topSpeed, Double combustivel) {
        super(chassi, tipo, topSpeed);
        this.combustivel = combustivel;
    }

    public void trocarOleo(){
        System.out.println("O veículo " + getTipo() + ", com " + getChassi() + " trocou o óleo");
    }

}
