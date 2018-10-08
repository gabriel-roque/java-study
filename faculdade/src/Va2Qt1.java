import javax.swing.*;

public class Va2Qt1 {
    public static void main(String[] args) {

        double salario, salarioD = 0;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salario do funcionario: "));

        salarioD = calcularDesconto(salario);
        JOptionPane.showMessageDialog(null, String.format("Salario \n Bruto: R$ %.2f\n Descontado: R$ %.2f", salario, salarioD));


    }

    private static double calcularDesconto(double valor) {

        double desconto = 0;

        desconto = ((11*valor) / 100);


        if (desconto > 318.20){

            valor = (valor - 318.20);


        }else{

            valor = (valor - desconto);

        }

        return valor;

    }
}

