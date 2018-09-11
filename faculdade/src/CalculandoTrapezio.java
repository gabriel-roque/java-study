import javax.swing.*;

public class CalculandoTrapezio {

    public static void main(String[] args) {

        String rBaseMenor = JOptionPane.showInputDialog(null, "Insira a base menor: ");
        double baseMenor = Integer.parseInt(rBaseMenor);
        
        String rBaseMaior = JOptionPane.showInputDialog(null, "Insira a base maior: ");
        double baseMaior = Integer.parseInt(rBaseMaior);

        String rAltura = JOptionPane.showInputDialog(null, "Insira a altura: ");
        double altura = Integer.parseInt(rAltura);

        double area = ((baseMenor + baseMaior) * altura)/2;

        JOptionPane.showMessageDialog(null, "Area do trapezio: " + area);
    }
}
