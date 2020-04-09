
package corridadragster;
import java.math.*;

public class CalcVelocidade {
    private int aceleracao;
    private int distancia;
    
    public double calcVelocidade(){
        double res = 2 * this.getAceleracao() * this.getDistancia();
        res = Math.sqrt(res);
        return res;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
}
