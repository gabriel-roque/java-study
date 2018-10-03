import javax.swing.*;

public class ArrayAlunos {
    public static void main(String[] args) {

        double totnotas = 0;
        double media = 0;
        int i = 0;

        String[] alunos = new String[5];
        double[] notas = new double[5];

        //1- leitura dos dados

        for (i = 0; i < alunos.length; i++){

            alunos[i] = JOptionPane.showInputDialog(null, "Insira o nome: ");
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a nota: "));
            totnotas += notas[i];

        }

        // exibe alunos e notas

        media = (totnotas / alunos.length);

        for (int x = 0; x < alunos.length; x++){

            JOptionPane.showMessageDialog(null,  "ALUNOS E NOTAS" + "\nAluno " + alunos[x] + "\nNota: " + notas[x]);

        }

        double maiorNota = 0;
        String maiorAluno = "";

        // somete alunos acima da media

        for (int j = 0; j < alunos.length; j++){

            if(notas[j] >= media){

                JOptionPane.showMessageDialog(null, "ALUNOS ACIMA DA MEDIA: "+ media + "\nAluno " + alunos[j] + "\nNota: " + notas[j]);

            }

            if(notas[j] > maiorNota){

                maiorNota = notas[j];
                maiorAluno = alunos[j];

            }
        }

        JOptionPane.showMessageDialog(null, "Aluno que obteve maior nota: \n" + maiorAluno);

        // busca na tabela


        String busca = JOptionPane.showInputDialog(null, "Insira o termo de pesquisa: ");

        int c = 0;

        for (c = 0; c < alunos.length; c++){

            if(busca.equals(alunos[c])){

                JOptionPane.showMessageDialog(null, "Aluno " + alunos[c] + "\nNota: " + notas[c]);
            }

        }

    }
}
