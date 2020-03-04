
package idiomasistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;


public class IdiomaSistema {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println("O sistema está em: "+locale.getDisplayLanguage());
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("A resolução da sua tela é: "+lar+" x "+alt);
    }
    
}
