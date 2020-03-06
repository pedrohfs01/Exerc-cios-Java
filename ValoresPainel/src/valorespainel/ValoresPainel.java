/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valorespainel;
import javax.swing.JOptionPane;
/**
 *
 * @author Fernandes
 */
public class ValoresPainel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s = 0, c = 0, m, i = 0, p = 0,a = 0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Digite um número:"
                    + "<br><em>(Valor 0 interrompe)</em></html>"));
            s += n;
            c++;
            if(n % 2 == 0){p++;}else{ i++; }
            if(n > 100){ a++; }
        }while(n != 0);
        m = s/(--c);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado final:<hr>"
                + "<br>Total de valores: "+c+"<br>Somátorio: "+s+""
                + "<br>Média dos valores: "+m+""
                + "<br>Números par: "+--p+"<br>Números impar: "+i+""
                + "<br>Números acima de 100: "+a+"</html>");
    }
    
}
