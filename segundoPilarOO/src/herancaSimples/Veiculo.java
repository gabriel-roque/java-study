package herancaSimples;

public class Veiculo {

    private String combustivel;
    private int rodas;
    private int ano;
    private String marca;


    public void locomover(){

        System.out.println("Veiculo se locomovendo...");

    }

    Veiculo (String combustivel, int rodas, int ano, String marca) {

        this.combustivel = combustivel;
        this.rodas = rodas;
        this.ano = ano;
        this.marca = marca;

    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
