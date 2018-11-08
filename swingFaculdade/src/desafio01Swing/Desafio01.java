package desafio01Swing;

import javax.swing.*;
import java.awt.*;

public class Desafio01 {
    public static void main(String[] args) {

        /*todo refatorar codigo*/

        // FRAME

        JFrame f = new JFrame("DESAFIO 01 SWING");


        // MENU BAR

        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuSobre = new JMenu("Sobre");
        JMenu subMenuSalvar = new JMenu("Salvar");
            JMenuItem a1 = new JMenuItem("Abrir");
            JMenuItem e1 = new JMenuItem("Sair");
            JMenuItem s1 = new JMenuItem("Salvar");
            JMenuItem s2 = new JMenuItem("Salvar como");

        subMenuSalvar.add(s1); subMenuSalvar.add(s2);
        menuArquivo.add(a1); menuArquivo.add(subMenuSalvar);
        menuArquivo.addSeparator(); menuArquivo.add(e1);

        JMenuBar menuCompleto = new JMenuBar();
            menuCompleto.add(menuArquivo);
            menuCompleto.add(menuSobre);
            f.setJMenuBar(menuCompleto);


        // TOP

        JLabel lMat = new JLabel("Matricula Aluno:");
            lMat.setBounds(15, 10, 130, 15);

        JTextField txMat = new JTextField();
            txMat.setBounds(120, 10, 60,17);


        JLabel lTur = new JLabel("Turma do Aluno:");
            lTur.setBounds(200, 10, 130, 15);

        JTextField txTur = new JTextField();
            txTur.setBounds(310, 10, 60,17);


        f.add(lMat); f.add(txMat);
        f.add(lTur); f.add(txTur);


        // SEPARATOR
        JSeparator sep01 = new JSeparator();
            sep01.setBounds(15, 35, 355, 1);

        f.add(sep01);


        // FORM MID

        int larguraD = 290;

            // Nome

        JLabel lNome = new JLabel("Nome:");
            lNome.setBounds(15, 45, 130, 15);

        JTextField txNome = new JTextField();
            txNome.setBounds(80, 45, larguraD,17);

            // Endereco

        JLabel lEnde = new JLabel("Endereco:");
            lEnde.setBounds(15, 65, 130, 15);

        JTextField txEnde = new JTextField();
            txEnde.setBounds(80, 65, larguraD,17);

            // Telefone

        JLabel lTel = new JLabel("Telefone:");
            lTel.setBounds(15, 85, 130, 15);

        JTextField txTel = new JTextField();
            txTel.setBounds(80, 85, larguraD,17);

            // CPF

        JLabel lCpf = new JLabel("CPF:");
            lCpf.setBounds(15, 105, 130, 15);

        JTextField lxCpf = new JTextField();
            lxCpf.setBounds(80, 105, larguraD,17);


        // RADIO BUTTON

            JRadioButton rAluno = new JRadioButton("Aluno");
                rAluno.setBounds(120,135, 60,15);

            JRadioButton rExAl = new JRadioButton("Ex Aluno");
                rExAl.setBounds(190,135, 80,15);


        f.add(lNome); f.add(txNome);
        f.add(lEnde); f.add(txEnde);
        f.add(lTel); f.add(txTel);
        f.add(lCpf); f.add(lxCpf);
        f.add(rAluno); f.add(rExAl);


        // SEPARATOR
        JSeparator sep02 = new JSeparator();
            sep02.setBounds(15, 165, 355, 1);

        f.add(sep02);


        // BUTTON

        JButton b1 = new JButton("OK!");
            b1.setBounds(50, 185, 60, 20);

        JButton b2 = new JButton("Atualizar");
            b2.setBounds(120, 185, 100, 20);

        JButton b3 = new JButton("Fechar");
            b3.setBounds(230, 185, 100, 20);

        f.add(b1); f.add(b2); f.add(b3);

        // CONFIG

        f.setSize(385,280);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
