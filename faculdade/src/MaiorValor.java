import javax.swing.*;

public class MaiorValor {
    public static void main(String[] args) {

        String varCp1 = JOptionPane.showInputDialog(null, "Insira o 1 valor");
        double n1 = Double.parseDouble(varCp1);

        String varCp2 = JOptionPane.showInputDialog(null, "Insira o 2 valor");
        double n2 = Double.parseDouble(varCp2);

        String varCp3 = JOptionPane.showInputDialog(null, "Insira o 3 valor");
        double n3 = Double.parseDouble(varCp3);


        if (n1 > n2 && n1 > n3){
            JOptionPane.showMessageDialog(null,"O maior valor e N1: " + n1);
        } else if (n2 > n1 && n2 > n3){
            JOptionPane.showMessageDialog(null, "O maior valor e N2: " + n2);
        } else {
            JOptionPane.showMessageDialog(null, "O maior valor e N3: " + n3);
        }

    }
}
