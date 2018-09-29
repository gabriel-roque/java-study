import javax.swing.*;

public class FatorialFor {
    public static void main(String[] args) {

        String cp = JOptionPane.showInputDialog(null, "Insira um valor: ");
        int valor = Integer.parseInt(cp);

        int f = valor;
        int c;

        for (c = valor-1; c > 0; c--){

            f = f*c;

        }

        JOptionPane.showMessageDialog(null, "Fatorial de " + valor + " e " + f );

    }
}
