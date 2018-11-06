package jButton;

import javax.swing.*;

public class Botao {
    public static void main(String[] args) {


        JFrame frame1 = new JFrame("Frame do APP"); // titulo do frame
        JButton btn = new JButton("Click here!"); // botao

        btn.setBounds(100, 100, 160, 50);
        frame1.add(btn); // adiciona o componente ao frame
        frame1.setSize(400,400);
        frame1.setLayout(null);
        frame1.setVisible(true); // visibilidade da janela


    }
}
