import javax.swing.*;

public class Operacoes2Var {
    public static void main(String[] args) {

        String cp1 = JOptionPane.showInputDialog(null, "Insira o 1 valor:");
        double n1 = Double.parseDouble(cp1);

        String cp2 = JOptionPane.showInputDialog(null, "Insira o 2 valor: ");
        double n2 = Double.parseDouble(cp2);

        String operacao = JOptionPane.showInputDialog(null, "OP 1 >> Soma \n" +
                                                                  "OP 2 >> Subtracao \n" +
                                                                  "OP 3 >> Multiplicacao");
        int op = Integer.parseInt(operacao);

        switch (op){

            case 1:

                JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1+n2));
                break;

            case 2:

                JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + (n1-n2));
                break;

            case 3:

                JOptionPane.showMessageDialog(null, n1 + " x " + n2 + " = " + (n1*n2));
                break;

        }

    }
}
