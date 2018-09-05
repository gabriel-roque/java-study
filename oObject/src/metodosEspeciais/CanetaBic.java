package metodosEspeciais;

public class CanetaBic {
    public static void main(String[] args) {
        Caneta canetaBic = new Caneta("BIC", 7.0, "Vermelha");
        canetaBic.status();

        Caneta cabetaFaber = new Caneta("Faber Castell", 5.0, "Preta");
        cabetaFaber.status();
    }
}
