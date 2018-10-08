import javax.swing.*;

public class Va2Qt2 {
    public static void main(String[] args) {

        String nome[] = new String[5];
        double salario[] = new double[5];

        double mSalario = 0;
        String mNome = "";

        for (int i = 0; i < nome.length; i++){

            nome[i] = JOptionPane.showInputDialog(null, "Insira o nome do funcionario: ");
            salario[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salario de " + nome[i]));

            if(salario[i] > mSalario){

                mSalario = salario[i];
                mNome = nome[i];

            }

        }

//        DEBUG

        for (int j = 0; j < salario.length; j++){

            System.out.println(nome[j]);
            System.out.println(salario[j]);

        }

        JOptionPane.showMessageDialog(null, "O maior salario pertece a " + mNome + " com R$ " + mSalario);

    }
}
