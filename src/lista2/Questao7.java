package lista2;

import java.util.Scanner;

public class Questao7 {
    Scanner sc = new Scanner(System.in);
    public Integer receba(){
        System.out.print("digita um valor ai: ");
        int num = sc.nextInt();
        return num;

    }
    public void inverso(int num){
        if (num >=10){
            int rev = 0;
            while(num>0) {
                rev *= 10;
                rev += num%10;
                num/=10;
            }
            System.out.printf("%d. \n", rev);
        } else {
            System.out.println("Esse número só possui uma unidade");
        }
    }
    public Integer invertido(int num){
        if (num >=10){
            int rev = 0;
            while(num>0) {
                rev *= 10;
                rev += num%10;
                num/=10;
            }
            System.out.printf("numero invertido: %d. \n", rev);
            return rev;
        } else {
            System.out.println("Esse número só possui uma unidade");
        }
        return 0;
    }
}
