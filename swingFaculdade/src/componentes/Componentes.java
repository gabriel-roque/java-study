package componentes;

import javax.swing.*;
import java.awt.*;

public class Componentes {
    public static void main(String[] args) {

        // FRAME

        JFrame frame = new JFrame("Componentes SWING");
            frame.setSize(800,400);
            frame.setLayout(null);
            frame.setVisible(true);


        // MENU

        JMenuBar bar = new JMenuBar();
            JMenu menu, submenu;
                JMenuItem i1, i2, i3, i4, i5;

        menu = new JMenu("Menu");
            submenu = new JMenu("SubMenu");

            i1 = new JMenuItem("Item 1");
            i2 = new JMenuItem("Item 2");
            i3 = new JMenuItem("Item 3");
            i4 = new JMenuItem("Item 4");
            i5 = new JMenuItem("Item 5");

        frame.setJMenuBar(bar);
            bar.add(menu);
                menu.add(submenu);

                menu.add(i1); menu.add(i2); menu.add(i3);
                submenu.add(i4); submenu.add(i5);

        // LABEL

        JLabel l1, l2;
            l1 = new JLabel("Label 01");
                l1.setBounds(20,5,200,80);
            l2 = new JLabel("Label 02");
                l2.setBounds(80,5,200,80);

        frame.add(l1); frame.add(l2);

        // COMBOBOX

        String paises[] = {"Brasil", "USA", "Russia", "Italia"};
        JComboBox box1 = new JComboBox(paises);

            box1.setBounds(20, 60, 80, 20);

        frame.add(box1);

        // LIST

        DefaultListModel<String> lista = new DefaultListModel<>();
            lista.addElement("Item 1");
            lista.addElement("Item 2");
            lista.addElement("Item 3");
            lista.addElement("Item 4");

        JList<String> list = new JList<>(lista);

        list.setBounds(100,100,75,75);
        frame.add(list);


        // CHECKBOX

        JCheckBox cx1, cx2;
            cx1 = new JCheckBox("PHP");
            cx1.setBounds(20, 150, 75,75);

            cx2 = new JCheckBox("JAVA");
            cx2.setBounds(20, 180, 75,75);

        frame.add(cx1); frame.add(cx2);

        //RADIO BUTTON

        JRadioButton r1, r2;
            r1 = new JRadioButton("Luke Skywalker");
            r1.setBounds(20, 200, 100,100);

        frame.add(r1);





























    }
}
