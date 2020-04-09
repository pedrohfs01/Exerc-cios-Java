
package alcance;

import java.util.Scanner;

public class CalcularTiro {
    public static void main(String[] args){
        Alcance alc = new Alcance();
        Scanner aux = new Scanner(System.in);
        double res;
        boolean ac;
        do{
            System.out.println("Digite a velocidade para acertar: ");
            alc.setVelocidade(aux.nextInt());
            System.out.println("Digite o angulo para acertar: (Precisa acertar entre 300 a 350m de alcance)");
            alc.setAngulo(aux.nextInt());
            res = alc.calcAlcance();
            if(res >= 300 && res <= 350){
                System.out.printf("ACERTOOU O ALVO!! %.2f\n", res);
                ac = true;
            }
            else{
                System.out.printf("ERROU, TENTE NOVAMENTE. %.2f\n", res);
                ac = false;
            }
        }
        while(ac == false);
    }
}
