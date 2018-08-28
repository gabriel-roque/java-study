public class Caneta {
    // Atributos da Minha classe caneta
    private String cor;
    private String tipo;
    private String marca;

    public static void main(String[] args) {
        Caneta novaCaneta = new Caneta();
        novaCaneta.setCor("Rosa");
        novaCaneta.status();
    }

    public void status(){
        System.out.println(cor);
        System.out.println(tipo);
        System.out.println(marca);
    }

    //GET and SET


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
