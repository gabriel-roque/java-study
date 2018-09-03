package Caneta;
// CLASSE FILHA
public class MinhasCanetas {
    public static void main(String[] args) {
        // CANETA 01
        Caneta canetabic = new Caneta();

        canetabic.modelo = "BIC";
        canetabic.cor = "Azul";
        canetabic.ponta = 0.5f;
        canetabic.carga = 77;
        canetabic.tampada = false;

        canetabic.tampar();
        canetabic.status();
        canetabic.rabiscar();

        System.out.println("\n");

        // CANETA 02
        Caneta canetaCastell = new Caneta();

        canetaCastell.modelo = "Faber Castell";
        canetaCastell.cor = "Vermelha";
        canetaCastell.ponta = 1.5f;
        canetaCastell.tampada = false;

        canetaCastell.status();
    }
}
