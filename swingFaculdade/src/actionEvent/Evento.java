package actionEvent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Evento implements ActionListener{


    public static void main(String[] args) {


        JFrame f = new JFrame("Action");

        JButton jb = new JButton("Teste");
            jb.setBounds(80, 100, 100,40);
            f.add(jb);
        JButton jb2 = new JButton("Sair");
            jb2.setBounds(210, 100, 100,40);
            f.add(jb2);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Mensagem teste");
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        f.setSize(400, 300);
        f.setResizable(false);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
