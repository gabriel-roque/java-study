package metodosespeciais;
// ESCREVO UMA VEZ APENAS E USO QUANTAS VEZES QUISER
 class Caneta {
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    /*Metodo CONSTRUTOR - toda nova classe que eu criar tera esses atributos
        > To.do metodo construtor deve conter o mesmo nome da classe.
    */
    Caneta(String modelo, double ponta, String cor){
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampar();
    }

    //obtendo os dados da classe que solicitar o modelo
    public String getModelo(){
        return this.modelo;
    }
    //estou enviando um parametro, que por sua vez anexa esse valor no campo modelo
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public double getPonta(){
        return this.ponta;
    }
    public void setPonta(double p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        /* nao foi necessario obter os dados pois ele veio com o dados padroes
           do metodo CONSTRUTOR
         */
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }

}
