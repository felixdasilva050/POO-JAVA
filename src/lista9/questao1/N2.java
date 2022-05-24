package lista9.questao1;

public class N2 extends N1 {
    private Integer n2;

    public Integer getN2() {
        return n2;
    }

    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    @Override
    public void imprimirNumero() {
        System.out.println("imprimir n2: " + n2);
    }

}
