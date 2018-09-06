package contaBancaria;

public class Cliente {
    public static void main(String[] args) {
        Banco cliente = new Banco();

        cliente.setDono("Gabriel");
        cliente.abrirConta("cc");
        cliente.setNumConta(125);
        cliente.resumoConta();

        cliente.sacar(10);
        cliente.depositar(60);
        cliente.sacar(100);

        cliente.resumoConta();

        cliente.fecharConta();
        cliente.resumoConta();
    }
}