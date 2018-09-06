package contaBancaria;

public class Banco {
    public int numConta;
    protected String tipoConta;
    private String dono;
    private double saldo;
    private boolean status;

    // CONSTRUTOR

    Banco(){
        this.status = false;
        this.setSaldo(0f);
    }

    // ATRIBUTOS

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getstatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //METODOS

    public void abrirConta(String tipoConta){
        this.setStatus(true);
        this.setTipoConta(tipoConta);

        if(tipoConta == "cp"){
            this.setSaldo(150);
        }
        else{
            this.setSaldo(50);
        }
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Possui dinheiro na conta ainda.");
        }
        if(this.getSaldo() < 0){
            System.out.println("Possui debitos com o banco.");
        }
        else {
            this.setStatus(false);
            this.setDono("");
            this.setNumConta(0);
            System.out.println("Conta Fechada com sucesso!");
        }

    }
    public void depositar(double deposito){
        if(this.getstatus() == true) {
            this.setSaldo(this.getSaldo() + deposito);
        }
        else {
            System.out.println("Necessario abrir conta.");
        }
    }
    public void sacar(double sacar){
        if(this.getstatus() == true){
            this.setSaldo(this.getSaldo() - sacar);
        }
        else{
            System.out.println("Necessario abrir conta.");
        }

    }
    public void pagarMensalidade(){
        if(this.tipoConta == "cc") {
            this.setSaldo(this.getSaldo() - 12);
        }
        else{
            this.setSaldo(this.getSaldo() - 20);
        }
    }
    public void resumoConta(){
        System.out.println("Dono: " + this.getDono());
        System.out.println("N Conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo() + "\n");
    }
}
