package lista8;

public class Operario extends Empregado{
    private Double valorProducao, comissao;

    public Operario(String name, String address, String phone,
                    Double salarioBase, Double imposto,
                    Double valorProducao, Double comissao) {
        super(name, address, phone, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(Double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + comissao;
    }
}
