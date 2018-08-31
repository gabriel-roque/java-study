import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class FormCidadao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Olá bom dia!");
        String nome = JOptionPane.showInputDialog(null,"Qual seu nome?");
        String valorAno = JOptionPane.showInputDialog(null, "Qual ano você nasceu?");


        /* Neste momento eu crio uma variavel chamda nasc, que nela irei alocar
           a conversão de String para int, atraves da Classe Wrapper Integer com seu metodo de conversão.
         */
        int nasc = Integer.parseInt(valorAno);

        /* Atraves da Classe Calender eé possivel obter datas do sistema
           anoAtual recebe atraves do metodo get o ano da maquina.
         */
        Calendar varCal = Calendar.getInstance();
        int anoAtual = varCal.get(Calendar.YEAR);
        int idade = (anoAtual-nasc);

        JOptionPane.showMessageDialog(null,nome + " você possui " + idade + " anos. ");




    }
}

