package lista7;

public class VeiculoTeste {
    public static void main(String[] args) {
        Bicicleta bicicleta1 = new Bicicleta("quadro","bicicleta",12.00,5);
        Bicicleta bicicleta2 = new Bicicleta("triângulo","bicicleta",12.00,2);
        Bicicleta bicicleta3 = new Bicicleta("retângulo","bicicleta",12.00,3);

        Carro carro1 = new Carro("mustang","carro",258.00,13.5);
        Carro carro2 = new Carro("camaro SS","carro",267.00,10.5);

        bicicleta1.ajustar();
        bicicleta1.limpar();

        bicicleta2.ajustar();
        bicicleta2.limpar();

        bicicleta3.ajustar();
        bicicleta3.limpar();

        carro1.ajustar();
        carro1.limpar();

        carro2.ajustar();
        carro2.limpar();

        bicicleta1.aumentarMarcha(2);
        bicicleta2.aumentarMarcha(3);
        bicicleta3.aumentarMarcha(1);

        carro1.incrementarVeloc(50);
        carro2.incrementarVeloc(78);

        carro1.trocarOleo();
        carro2.trocarOleo();

        System.out.println(Veiculo.getCont());
    }
}
