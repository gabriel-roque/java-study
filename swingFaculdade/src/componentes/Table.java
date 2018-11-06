package componentes;

import javax.swing.*;

public class Table {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Table");
            frame.setBounds(50,50,200,300);
            frame.setLayout(null);
            frame.setVisible(true);


        String date[][]=
                {{"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};

        String collumn[] = {"ID", "NAME", "NUMBER"};

        JTable tabela = new JTable(date, collumn);
        tabela.setBounds(0,0,200,300);

        frame.add(tabela);

    }
}
