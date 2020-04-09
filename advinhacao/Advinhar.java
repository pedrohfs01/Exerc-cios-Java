package advinhacao;

import java.util.Scanner;

public class Advinhar {
    public static void main(String[] args){
        Metodos num1 = new Metodos();
        Scanner aux = new Scanner(System.in);
        int i = 5;
        System.out.println("Primeiro jogador | Entre com um número: ");
        num1.setNumero(aux.nextInt());
        
        do{
            System.out.printf("Segundo jogador(Chances: %d) | Tente advinhar o número: ", i);
            num1.setNumero2(aux.nextInt());
            
            if(num1.getNumero2() > num1.getNumero()){
                System.out.println("MAIS BAIXO");
            }
            else if(num1.getNumero2() < num1.getNumero()){
                System.out.println("MAIS ALTO");
            }
            else if(num1.getNumero2() == num1.getNumero()){
                System.out.println("ACERTOU!!");
                i = 0;
            }
            
            i--;
            if(i == 0){
                System.out.println("-----------------------\n\nACABOU AS CHANCES\n\n-----------------------");
            }
        }while(i > 0);
    }
}
