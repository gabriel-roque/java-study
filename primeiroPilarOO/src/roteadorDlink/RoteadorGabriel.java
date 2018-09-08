package roteadorDlink;

public class RoteadorGabriel {
    public static void main(String[] args) {
        Dlink router = new Dlink();

        router.ligar();
        router.definirRede("Falcon");
        router.conectar();

        router.statusRede();
    }
}
