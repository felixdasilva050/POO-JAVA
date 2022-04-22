package lista7;

public class Veiculo {
    private String chassi, tipo;
    private Double topSpeed;
    private static Integer cont=0;

    public Veiculo() {}
    public Veiculo(String chassi, String tipo, Double topSpeed) {
        cont++;
        this.chassi = chassi;
        this.tipo = tipo;
        this.topSpeed = topSpeed;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public static Integer getCont() {
        return cont;
    }

    public static void setCont(Integer cont) {
        Veiculo.cont = cont;
    }

    public void limpar(){
        System.out.println("O veículo" + tipo +", com " + chassi + " está sendo limpo");
    }

    public void ajustar(){
        System.out.println("O veículo" + tipo + ", com " + chassi + " está sendo ajustado");
    }

    public void incrementarVeloc(Integer resultado){
        topSpeed = topSpeed + resultado;
        System.out.println("O veículo" + tipo + ", com " + chassi + " agora tem a" + topSpeed + "km/h de velocidade");
    }
}
