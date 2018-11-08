package desafio01Swing;

import javax.swing.*;
import java.awt.*;

public class Gui01{
    public static void main(String[] args) {

        // FRAME

        JFrame f = new JFrame("DESAFIO 01 SWING");
//        f.setLayout(new GridLayout(3, 0));

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


        // PAINEL TOP

        JPanel pTop = new JPanel();
            pTop.setBounds(10,5, 375, 10);
//            pTop.setBackground(Color.cyan);

            // Matricula

        JLabel mat = new JLabel("Matricula Aluno: ");
            mat.setBounds(5,5,100,50);
        JTextField cpMat = new JTextField();
            cpMat.setColumns(5);
            cpMat.setBounds(30,5,100,50);

            // Turma

        JLabel tur = new JLabel("Turma Aluno");
            tur.setBounds(60,5, 100,50);
        JTextField cpTur = new JTextField();
            cpTur.setColumns(5);
            cpTur.setBounds(80,5,100,50);

        pTop.add(mat); pTop.add(cpMat);
        pTop.add(tur); pTop.add(cpTur);
        f.add(pTop, BorderLayout.NORTH);


        // SEPARTOR TOP

        JSeparator separadorTop = new JSeparator();
//            separadorTop.setBounds(10, 15, 475,50);
        f.add(separadorTop);

        // PAINEL MID

        JPanel pMid = new JPanel();
            pMid.setBounds(10,50,375,10);
//            pMid.setBackground(Color.gray);
        f.add(pMid, BorderLayout.CENTER);

        JLabel l1, l2, l3, l4;
        JTextField tx1, tx2, tx3, tx4;

        l1 = new JLabel("Nome:");
        l2 = new JLabel("Endereço:");
        l3 = new JLabel("Telefone:");
        l4 = new JLabel("CPF:");









        // CONFIG FRAME

//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(400,300);
        f.setVisible(true);
        f.setResizable(false);






    }
}
