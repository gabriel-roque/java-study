package componentes;

import javax.swing.*;

public class ButtonRadio {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Radio Button");
        frame.setBounds(50,50,200,200);
        frame.setLayout(null);
        frame.setVisible(true);


        // RADIO BUTTON


        JRadioButton r1, r2;
            r1 = new JRadioButton("Luke Skywalker");
            r1.setBounds(10,10, 150,50);

            r2 = new JRadioButton("Leia Skywalker");
            r2.setBounds(10,40,150,50);

        frame.add(r1); frame.add(r2);

    }
}
