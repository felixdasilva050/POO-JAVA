package lista8;

public class Administrador extends Empregado{
    private Double ajudaCusto;

    public Administrador(String name, String address,
                         String phone, Double salarioBase,
                         Double imposto, Double ajudaCusto) {
        super(name, address, phone, salarioBase, imposto);
        this.ajudaCusto = ajudaCusto;
    }

    public Double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(Double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + ajudaCusto;
    }
}
