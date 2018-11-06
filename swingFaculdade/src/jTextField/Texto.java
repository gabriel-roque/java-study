package jTextField;

import javax.swing.*;

public class Texto {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Text Field");
        frame.setSize(300,200);


        JTextField t1, t2;
        t1 = new JTextField("Area 1");
        t1.setBounds(20,20,200,80);
        t1.setColumns(3);

        frame.add(t1);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
