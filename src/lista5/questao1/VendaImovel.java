package lista5.questao1;

import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Imovel imovel1 = new Imovel();
        ImovelNovo imovelNovo   = new ImovelNovo();
        ImovelUsado imovelUsado = new ImovelUsado();
        Double valorPorcentagem, resultado, valorImovel;
        String endereco;
        System.out.println("Qual é o endereço? ");
        endereco = sc.nextLine();
        imovel1.setEndereco(endereco);

        System.out.println("Qual o valor do Imóvel? ");
        valorImovel = sc.nextDouble();
        imovel1.setPreco(valorImovel);

        System.out.println("Qual tipo do imóvel? (digite 1 para novo e 2 para usado)");
        Integer tipoImovel = sc.nextInt();
        switch (tipoImovel){
            case 1:
                System.out.println("qual valor da porcentagem para adicionar?");
                valorPorcentagem = sc.nextDouble();
                imovelNovo.setPorcentagemAdicional(valorPorcentagem);
                imovelNovo.mensagemPorcentagemAdicional();
                resultado = (imovel1.getPreco() + (imovel1.getPreco()*imovelNovo.getPorcentagemAdicional()));
                System.out.printf("\nO valor final é: %.2f", resultado);
                System.out.println("\nno endereço: " + imovel1.getEndereco());
                break;
            case 2:
                System.out.println("qual valor da porcentagem para descontar?");
                valorPorcentagem = sc.nextDouble();
                imovelUsado.setPorcentagemDesconto(valorPorcentagem);
                imovelUsado.mensagemPorcentagemDesconto();
                resultado = (imovel1.getPreco() - (imovel1.getPreco()*imovelUsado.getPorcentagemDesconto()));
                System.out.printf("\nO valor final é: %.2f", resultado);
                System.out.println("\nno endereço: " + imovel1.getEndereco());
                break;
            default:
                System.out.println("Tipo de imóvel não encontrado! Verifique se digitou o tipo corretamente e tente de novo.");
        }
        sc.close();
    }
}
