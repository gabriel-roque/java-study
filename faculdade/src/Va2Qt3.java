import javax.swing.*;

public class Va2Qt3 {
    public static void main(String[] args) {

        String[] aluno = new String[10];

        for (int i = 0; i < aluno.length; i++){

//            aluno[i] = JOptionPane.showInputDialog(null, "Insira o nome " + i + " aluno: ");
            aluno[i] = JOptionPane.showInputDialog(null, String.format("Insira o nome %d aluno: ", i+1));

        }

        JOptionPane.showMessageDialog(null, aluno);

    }
}
