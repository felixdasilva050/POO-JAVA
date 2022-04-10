package lista5.questao2;

public class Ingresso {
    private Double valor;

    Ingresso(){}

    public Ingresso(Double valor){
        this.valor = valor;
    }
    public void imprimeValor(Double valor){
        System.out.println(valor);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
