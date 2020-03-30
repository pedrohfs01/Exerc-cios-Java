
package aulacv3;


public class Banco {
    public static void main(String[] args){
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("5043", "CP", "Pedro Henrique");
        c1.depositar(500);
        c1.sacar(150);
        c1.pagarMensal();
        c1.status();
        c1.sacar(495);
        c1.fecharConta();
        c1.status();
    }
}
