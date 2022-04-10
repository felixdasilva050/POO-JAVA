package lista5.questao2;

public class Vip extends Ingresso{
    private Double valorAdicional;

    public Double getValorIngressoVip(Double valor, Double valorAdicional){
        setValor(valor);
        this.valorAdicional = valorAdicional;
        Double total = getValor() + this.valorAdicional;
        return total;
    }

}
