package smartphone;

public class MotoG5 {
    public static void main(String[] args) {
        Motorola motoG5 = new Motorola();

        motoG5.modelo = "Moto G5";
        motoG5.suporteP2 = true;
        motoG5.anoLacamento = 2018;
        motoG5.espaco = 32;
        motoG5.memRam = 3;

        motoG5.status();
    }
}
