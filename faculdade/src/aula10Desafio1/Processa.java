package aula10Desafio1;

import javax.swing.*;

public class Processa extends Entrada {

    private int total;


    public void soma(){

        setTotal(getNum1() + getNum2());

    }

    public void verifica(){

        int temp = 0;

        temp = Integer.parseInt(JOptionPane.showInputDialog
                (null, "Insira sua senha: "));

        if(temp == getSenha()){

            JOptionPane.showMessageDialog
                    (null, "Total da soma: " + getTotal());

        }else{

            JOptionPane.showMessageDialog
                    (null, "Senha Incorreta");
            verifica();

        }
    }

    public void run(){

        entrada();
        soma();
        verifica();

    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
