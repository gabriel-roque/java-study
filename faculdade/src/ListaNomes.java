import javax.swing.*;

public class ListaNomes {
    public static void main(String[] args) {

        int idadeV = 0;
        String nomeV = "";

        String nome = (JOptionPane.showInputDialog(null, "Insira um nome"));
        int idade = Integer.parseInt ((JOptionPane.showInputDialog(null, "Insira idade")));


        if(idade > idadeV) {

            nomeV = nome;
            idadeV = idade;

        }

        String rep = (JOptionPane.showInputDialog(null, "fim >> SAIR" + "\ns >> CONTINUAR"));


        while (rep.equals("s")){


            nome = (JOptionPane.showInputDialog(null, "Insira um nome"));
            idade = Integer.parseInt ((JOptionPane.showInputDialog(null, "Insira idade")));


            if(idade > idadeV) {

                nomeV = nome;
                idadeV = idade;

            }

            rep = (JOptionPane.showInputDialog(null, "fim >> SAIR" + "\ns >> CONTINUAR"));

        }

        JOptionPane.showMessageDialog(null,  nomeV + " pessoa mais velha com " + idadeV);



    }
}

