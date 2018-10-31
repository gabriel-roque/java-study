package aula10Desafio2;

import javax.swing.*;
import java.text.Format;

public class Processa extends Input{

    private double desconto;
    private double totaPagar;


    public void processar(){

        // CALCULA DESCONTO
        if(getValorCarro() >= 2000){

            setDesconto(getValorCarro() * 0.07);
            setTotaPagar(getValorCarro() - getDesconto());

        }else{

            setDesconto(getValorCarro() * 0.12);
            setTotaPagar(getValorCarro() - getDesconto());

        }
    }


    public void exibir(){

        JOptionPane.showMessageDialog
                (null, String.format("Desconto R$: %.2f", getDesconto())
                        + "\nTotal a pagar: " + getTotaPagar());

    }

    public void run(){

        String resp = "s";

        while (!(resp.equals("n"))){


            entrada();
            processar();
            exibir();


            resp = JOptionPane.showInputDialog
                    (null, "Deseja continuar? [s/n]");

        }
    }



    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTotaPagar() {
        return totaPagar;
    }

    public void setTotaPagar(double totaPagar) {
        this.totaPagar = totaPagar;
    }
}
