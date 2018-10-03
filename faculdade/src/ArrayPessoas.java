import javax.swing.*;
import java.util.Calendar;

public class ArrayPessoas {
    public static void main(String[] args) {

        String[] pessoa = new String[5];
        int[] idade = new int[5];
        int[] nasc = new int[5];
        Calendar cal = Calendar.getInstance();
        int anoAtual = cal.get(Calendar.YEAR);

        // leitura de dados e calcula nascimento

        for (int i = 0;  i < pessoa.length; i++){

            pessoa[i] = JOptionPane.showInputDialog(null, "Insira o nome: ");
            idade[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade: "));
            nasc[i] = (anoAtual - idade[i]);

        }

        // exibe nascimento

        for (int j = 0; j < pessoa.length; j++){

            JOptionPane.showMessageDialog(null, pessoa[j] + " nasceu em " + nasc[j]);

        }

        // execulta a pesquisa pelo filtro

        int pergIdade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade de filtro"));

        for(int k = 0; k < pessoa.length; k++){

            if (idade[k] > pergIdade){

                JOptionPane.showMessageDialog(null, "MAIS VELHOS QUE " + pergIdade
                                                                    + "\nPessoa: " + pessoa[k] + "\nIdade: " + idade[k]);
            }

        }

        // busca na tabela

        String busca = JOptionPane.showInputDialog(null, "Insira o termo de pesquisa: ");

        int cc = 0;

        for (cc = 0; cc < pessoa.length; cc++){

            if(busca.equals(pessoa[cc])){

                JOptionPane.showMessageDialog(null, "Pessoa: " + pessoa[cc] + "\nIdade: " + idade[cc]);
            }

        }

    }
}
