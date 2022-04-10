package lista5.questao1;

public class ImovelUsado extends Imovel{
    private Double porcentagemDesconto;

    public Double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }

    public void setPorcentagemDesconto(Double porcentagemDesconto) {
        this.porcentagemDesconto = (porcentagemDesconto/100);
    }
    public void mensagemPorcentagemDesconto(){
        Double valorPorcentagem = (this.porcentagemDesconto * 100);
        System.out.printf("A porcentagem de desconto é: %.2f%%", valorPorcentagem);
    }
}
