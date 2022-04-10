package lista5.questao2;

public class CamaroteInferior extends Vip{
    private String lugar;

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public void imprimaLugar(){
        System.out.println("lugar é: " + lugar);
    }
}
