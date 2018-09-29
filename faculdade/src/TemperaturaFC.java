import javax.swing.*;

public class TemperaturaFC {
    public static void main(String[] args) {

        double f = 50;

        while (f <= 150){

            double c = (5*(f - 32)) / 9;

            System.out.format("\n %.2f F > %.2f C", f, c);
            f+= 10;
        }
    }
}
