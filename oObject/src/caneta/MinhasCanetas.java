package caneta;
// CLASSE FILHA
public class MinhasCanetas {
    public static void main(String[] args) {
        Caneta canetabic = new Caneta();

        canetabic.modelo = "Caneta BIC";
        canetabic.cor = "Azul";
//      canetabic.ponta = 0.5f;
        canetabic.carga = 80;
        canetabic.tampada = false;

        canetabic.status();
        canetabic.tampar();
        canetabic.rabiscar();

    }
}
