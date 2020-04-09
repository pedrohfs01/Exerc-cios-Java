
package corridadragster;

import java.util.Scanner;


public class CorridaDragster {
   public static void main(String[] args){
       
       CalcVelocidade c1 = new CalcVelocidade();
       Scanner aux = new Scanner(System.in);
       double res, rec = 0;
       int i = 0;
       do{
            System.out.println("Digite a aceleração: ");
            c1.setAceleracao(aux.nextInt());
            System.out.println("Digite a distância em metros");
            c1.setDistancia(aux.nextInt());

            res = c1.calcVelocidade() / 3.6;
            rec = res > rec ? res : rec;
            System.out.printf("\nVelocidade final: %.2f km/h\n",res);
            System.out.printf("\nRECORDE: %.2f\n", rec);
            i++;
       }while (i < 5);
   } 
}
