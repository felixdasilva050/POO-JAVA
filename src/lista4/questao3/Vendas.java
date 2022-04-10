package lista4.questao3;

public class Vendas {
    private static final Double DESCONTO_30 = 0.3;
    private static final Double DESCONTO_10 = 0.1;

    public Double obterTaxaDesconto(Integer codigoDesconto, Double valor){
        if (codigoDesconto == 1){
            return (valor - (valor * DESCONTO_10));
        }
        else {
            return (valor - (DESCONTO_30 * valor));
        }
    }
}
