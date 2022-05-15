package lista8;

public class Empregado extends Pessoa{
    private static Integer codSetor = 0;
    private Double salarioBase, imposto;

    public Empregado(String name, String address, String phone, Double salarioBase, Double imposto) {
        super(name, address, phone);
        this.codSetor++;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double calcularSalario(){
        return this.salarioBase - ((this.imposto/100.00)*salarioBase);
    }
}
