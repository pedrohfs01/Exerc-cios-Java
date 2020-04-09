
package alcance;

import static java.lang.Math.sin;
import java.math.*;

public class Alcance {
    private int velocidade;
    private int angulo;
    public Alcance(){
        
    }   
    public double calcAlcance(){
        double res =(Math.pow(this.getVelocidade(),2) * (Math.sin(2*this.getAngulo()))) / 9.8;
        return res;
    }
    
    
    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAngulo() {
        return this.angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }
}
