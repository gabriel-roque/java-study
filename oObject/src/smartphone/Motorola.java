package smartphone;

public class Motorola {
    String modelo;
    boolean suporteP2;
    int anoLacamento;
    int espaco;
    int memRam;

    void ligado(){

    }
    void bloquear(){

    }
    void status(){
        System.out.println("Modelo smartfone " +  this.modelo);
        System.out.println("Suporte a entrada P2? " +  this.suporteP2);
        System.out.println("Ano de lancamento: " +  this.anoLacamento);
        System.out.println("Espaco de armazenamento: " +  this.espaco  + " GB");
        System.out.println("Memoria RAM: " +  this.memRam  + " GB RAM");

    }
}
