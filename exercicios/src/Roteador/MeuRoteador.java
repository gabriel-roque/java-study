package Roteador;

public class MeuRoteador {
    public static void main(String[] args) {

        Dlink router = new Dlink();

        router.ligar();
        router.definirNome("SKYWALKER");
        router.conectar();

    }
}
