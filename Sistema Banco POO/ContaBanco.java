
package aulacv3;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public ContaBanco(){//Método Construtor
        this.setnumConta("Abra conta");
        this.setTipo("Abra conta");
        this.setDono("Abra conta");
        this.setSaldo(0f);
        this.setStatus(false);
    }
    
    public void abrirConta(String nC, String tipo, String dono){
        if(this.getStatus() == false){
            this.setnumConta(nC);
            this.setTipo(tipo);
            this.setDono(dono);
            this.setStatus(true);
            if(this.getTipo().equals("CC")){
                this.setSaldo(50f);
                System.out.println("Conta corrente aberta(R$ 50,00 ADICIONADOS)");
            }
            else if(this.getTipo().equals("CP")){
                this.setSaldo(150f);
                System.out.println("Conta poupança aberta(R$ 150,00 ADICIONADOS)");
            }
            else{
                System.out.println("TIPO INVÁLIDO DE CONTA.");
            }
        }
        else{
            System.out.println("Abra a conta primeiro");
        }
    }
    public void fecharConta(){
        if(this.getStatus() == true){
            if(this.getSaldo() > 0){
                System.out.println("Saque o seu dinheiro para fechar conta.");
            }
            else if(this.getSaldo() < 0){
                System.out.println("Saldo devedor, deixe seu saldo positivo para fechar conta");
            }
            else{
                this.setnumConta("Abra conta");
                this.setTipo("Abra conta");
                this.setDono("Abra conta");
                this.saldo = 0f;
                this.setStatus(false);
                System.out.println("Conta fechada.");
            }
        }
        else{
            System.out.println("Abra a conta primeiro");
        }
    }
    public void depositar(float v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo()+v);
            System.out.printf("Valor R$ %.2f depositado com sucesso\n", v);
        }
        else{
            System.out.println("Abra a conta primeiro");
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true){
            if(v <= this.getSaldo()){
                this.setSaldo(this.getSaldo()-v);
                System.out.printf("Valor R$ %.2f sacado com sucesso\n", v);
            }
            else{
                System.out.println("Saldo insuficiente ou negativo, inacessível o saque.");
            }
        }
        else{
            System.out.println("Abra a conta primeiro");
        }
    }
    public void pagarMensal(){
        if(this.getStatus() == true){
            if(this.getTipo().equals("CC")){
                if(this.getSaldo() >= 10){
                    this.setSaldo(this.getSaldo()-10);
                    System.out.println("R$10 Cobrados pela mensalidade");
                }
                else{
                    System.out.println("Saldo insuficiente para pagar mensalidade.");
                }
            }
            else if(this.getTipo().equals("CP")){
                if(this.getSaldo() >= 5){
                    this.setSaldo(this.getSaldo()-5);
                    System.out.println("R$5 Cobrados pela mensalidade");
                }
                else{
                    System.out.println("Saldo insuficiente para pagar mensalidade.");
                }
            }
            else{
                System.out.println("Tipo de conta inválida.");
            }
        }
        else{
            System.out.println("Abra a conta primeiro");
        }
    }
    public void status(){
        if(this.getStatus() == true){
            System.out.printf("\n%s\n", this.getTipo().equals("CC") ? "Conta Corrente" : "Conta Poupança");
            System.out.println("Número conta:"+this.getnumConta()
                    + "\nNome do dono: "+this.getDono()+"\n"
                    +"Status da conta: "+this.getStatus());
            System.out.printf("Saldo: R$ %.2f\n", this.getSaldo());
        }
        else{
            System.out.println("Abra a conta!");
        }
    }
    
    public String getnumConta(){
        return this.numConta;
    }
    public void setnumConta(String c){
        this.numConta = c;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public String getDono(){
        return this.dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }

    
}
