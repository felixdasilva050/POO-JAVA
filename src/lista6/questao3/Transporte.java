package lista6.questao3;

public class Transporte {
    private boolean ligado;
    private int velocidade;

    public boolean liga(){
        return ligado = true;
    }

    public boolean desliga(){
        velocidade = 0;
        return ligado = false;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        if(velocidade <0 ){
            System.out.println("Tá com preguiça ?");
        } else {
            this.velocidade = velocidade;
        }
    }
}
