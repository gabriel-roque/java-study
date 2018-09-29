import javax.swing.*;

public class FatorialWhile {
    public static void main(String[] args) {

        String cp = JOptionPane.showInputDialog(null, "Insira um valor: ");
        int valor = Integer.parseInt(cp);

        int f = valor;
        int c = valor-1;

        while (c > 0){

            f = f*c;
            c--;

        }

        JOptionPane.showMessageDialog(null, "Fatorial de " + valor + " e " + f );
    }
}
