package lista5.questao1;

import java.text.Format;

public class ImovelNovo extends Imovel{
    private Double porcentagemAdicional;

    public Double getPorcentagemAdicional() {
        return porcentagemAdicional;
    }

    public void setPorcentagemAdicional(Double porcentagemAdicional) {
        this.porcentagemAdicional = (porcentagemAdicional/100); //aqui já "SETO" a porcentagem que o usuário quer adicionar
    }
    public void mensagemPorcentagemAdicional(){
        Double valorPorcentagem = (this.porcentagemAdicional * 100);
        System.out.printf("A porcentagem adicional é de: %.2f%%", valorPorcentagem);
    }
}
