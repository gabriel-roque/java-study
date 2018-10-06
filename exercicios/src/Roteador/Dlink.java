package Roteador;

public class Dlink implements Roteador{

    private String nome;
    private boolean ligado;
    private boolean conectar;

    Dlink() {

        this.ligado = false;
        this.conectar = false;

    }


    public void ligar() {

        this.ligado = true;
        System.out.println("Ligando Roteador");

    }

    public void definirNome(String nome) {

        this.setNome(nome);

    }

    public void conectar() {

        this.conectar = true;
        System.out.println("Conectando....");

    }




    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isConectar() {
        return conectar;
    }

    private void setConectar(boolean conectar) {
        this.conectar = conectar;
    }
}
