package jLabel;

import javax.swing.*;

public class Label {
    public static void main(String[] args) {

        //crio o FRAME e o tamanho dele

        JFrame frame1 = new JFrame("Labels");
        frame1.setSize(300,200);

        //crio os COMPONETES e o seu tamnho

        JLabel l1, l2;
        l1 = new JLabel("Label 1");
        l1.setBounds(50,50,100,30);
        l2 = new JLabel("Label 2");
        l2.setBounds(50,100,100,30);


        // add os COMPONETES no FRAME

        frame1.add(l1); frame1.add(l2);

        // Janela visivel
        frame1.setLayout(null);
        frame1.setVisible(true);
    }
}
