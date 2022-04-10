package lista4.questao3;

public class MainVendas {
    public static void main(String[] args) {
        Vendas venda1 = new Vendas();
        Double resultado = venda1.obterTaxaDesconto(1, 50.0);
        System.out.println(resultado);
    }
}
