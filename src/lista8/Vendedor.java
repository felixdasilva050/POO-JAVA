package lista8;

public class Vendedor extends Empregado{
    private Double valorVendas, comissao;

    public Vendedor(String name, String address,
                    String phone, Double salarioBase,
                    Double imposto, Double valorVendas, Double comissao) {
        super(name, address, phone, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + comissao;
    }
}
