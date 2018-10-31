package aula10Desafio2;

import javax.swing.*;

public class Input{

    private double valorCarro;


    public void entrada(){

//        String resp = "";
//
//        while (!(resp.equals("n"))){

            setValorCarro(Integer.parseInt(JOptionPane.showInputDialog
                    (null, "Valor do Veiculo: ")));


//            resp = JOptionPane.showInputDialog
//                    (null, "Deseja continuar?[s/n]");
//
//        }

    }

    public double getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(double valorCarro) {
        this.valorCarro = valorCarro;
    }
}
