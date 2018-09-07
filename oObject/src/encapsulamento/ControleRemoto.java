package encapsulamento;

// para implementar os metodos da interface basta usar implements (nome da interface)

public class ControleRemoto implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //construtor
    ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //metodos

    /* eu colocando como privado meus get e set, somente terei
        acesso pela interface
     */

    // >> VOLUME
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int volume){
        this.volume = volume;
    }
    // >> LIGADO
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    // >> TOCANDO
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean tocando){
        this.tocando = tocando;
    }

    //metodos abstratos
    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void abrirMenu() {
        System.out.println("Esta Ligado? " + this.getLigado());
        System.out.println("Esta Tocando? " + this.getTocando());
        System.out.println("Volume: " + getVolume());

        for (int i = 0; i < this.getVolume(); i+=10){
            System.out.print("/");
        }
    }

    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    public void maisVolume() {
        if (this.getLigado()){
            setVolume(getVolume() + 1);
        }
    }

    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }
    }

    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }

    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}