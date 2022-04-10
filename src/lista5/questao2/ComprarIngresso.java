package lista5.questao2;

import java.util.Scanner;

public class ComprarIngresso {
    public static void main(String[] args) {
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        CamaroteInferior camaroteInferior = new CamaroteInferior();
        Scanner sc = new Scanner(System.in);
        Ingresso ingresso = new Ingresso();
        Normal normal = new Normal();
        Vip vip       = new Vip();
        Integer tipoIngreso;
        Double adicional = 300.00;

        ingresso.setValor(500.00);
        camaroteInferior.setLugar("B15");

        System.out.println("Consagrado, digita 1 para normal e 2 para VIP");
        tipoIngreso = sc.nextInt();
        sc.reset();
        switch (tipoIngreso){
            case 1:
                normal.imprimeIngressoNormal();
            break;
            case 2:
                System.out.println("INGRESSO VIP! TODO AMOSTRADO");
                System.out.println("Agora que tu tá já se amostrou, me diz ai: \nCamarote superior (digita 1)\n Camarote Inferior (digita 2)");
                Integer opcao = sc.nextInt();
                if(opcao == 1){
                    Double total = camaroteSuperior.valorDoIngressoSuperior(ingresso.getValor(), adicional);
                    System.out.println("Olha ai ricão: R$" + total);
                } else if (opcao == 2 ){
                    System.out.println("Ouxi, teu lugar é esse ai oh: " + camaroteInferior.getLugar());
                }
                else {
                    System.out.println("Acho que tu digitou alguma coisa errada aí, visse!");
                }
            break;

            default:
                System.out.println("Ouxi, errasse o código! Vou parar aqui visse");

        }

    }
}
