import javax.swing.*;
import java.math.*;

public class Delta {
    public static void main(String[] args) {

        String varCp1 = JOptionPane.showInputDialog(null, "Insira o valor de A");
        double a = Double.parseDouble(varCp1);

        String varCp2 = JOptionPane.showInputDialog(null, "Insira o valor de B");
        double b = Double.parseDouble(varCp2);

        String varCp3 = JOptionPane.showInputDialog(null, "Insira o valor de C");
        double c = Double.parseDouble(varCp3);


        double delta = ((b*b) -4 * a * c);
        double x1, x2;

        if(delta > 0){

            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));

            JOptionPane.showMessageDialog(null, "Valor X1: " + x1 + "\n" + "Valor X2: " + x2);


        } else if(delta == 0){

            x1 = x2 = ((-b) / 2 * a);
            JOptionPane.showMessageDialog(null, "Valor X1: " + x1 + "\n" + "Valor X2: " + x2);;

        }else{

            JOptionPane.showMessageDialog(null, "Nao existem raizes reias");

        }

    }
}
