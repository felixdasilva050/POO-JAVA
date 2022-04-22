package lista6.questao3;

public class Carro extends Transporte{
    private int quilometragem;


    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        if (quilometragem < 0 & quilometragem > 999999){
            System.out.println("Quilometragem não pode ser negativa e nem ultrapassar o valor de 999999");
        } else {
            this.quilometragem = quilometragem;
        }
    }

    @Override
    public void setVelocidade(int velocidade) {
        if(velocidade < 200){
            super.setVelocidade(velocidade);
        }
    }
}