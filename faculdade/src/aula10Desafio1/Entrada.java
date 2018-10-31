package aula10Desafio1;

import javax.swing.JOptionPane;

public class Entrada {

    private int senha;
    private int num1;
    private int num2;


    public void entrada(){

        this.setSenha(Integer.parseInt(JOptionPane.showInputDialog
                (null, "Insira sua senha:")));

        this.setNum1(Integer.parseInt(JOptionPane.showInputDialog
                (null, "Insira 1 valor:")));

        this.setNum2(Integer.parseInt(JOptionPane.showInputDialog
                (null, "Insira 2 valor:")));

    }


    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
