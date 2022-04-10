package lista5.questao2;

public class CamaroteSuperior extends Vip{

    private Double valorAdicional;

    public Double valorDoIngressoSuperior(Double valor, Double valorAdicional){
        Double resultado = getValorIngressoVip(valor, valorAdicional);
        return resultado;
    }
}
