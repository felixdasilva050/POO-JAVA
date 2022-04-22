package lista7;

public class Bicicleta extends Veiculo {
    private Integer numMarcha;

    Bicicleta(){}

    public Bicicleta(String chassi, String tipo, Double topSpeed, Integer numMarcha) {
        super(chassi, tipo, topSpeed);
        this.numMarcha = numMarcha;
    }
    public void aumentarMarcha(Integer marcha){
        numMarcha = numMarcha + marcha;
        Double divisao = (super.getTopSpeed()*100);
        Integer resultado =  (numMarcha/divisao.intValue());
        super.incrementarVeloc(resultado);
    }
}
