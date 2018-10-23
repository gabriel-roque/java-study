import javax.swing.*;

public class RotinaVetor {


    public static void receberValor(){

//        double a[] = new int[5];
//        double b[] = new int[5];

        double a[] = {5,3,6,9,4};
        double b[] = {6,9,4,5,8};

        for (int i = 0; i < a.length; i++){

            a[i] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Insira o %d valor de A", i+1), a[i]));
            b[i] = Double.parseDouble(JOptionPane.showInputDialog(null, String.format("Insira o %d valor de B", i+1), b[i]));

        }


       for(int c = 0; c < a.length; c++){

           if(a[c] % 2 == 0){
               par(c, a, b);
           }else
               if (a[c] % 2 == 1){
                   impar(c, a, b);
               }
       }


        menu();
       //chamar menu //todo
    }


    public static void par(int cont, double[] a, double[] b){
        double c[] = new double[5];

        c[cont] = (a[cont] * b[cont]);

        JOptionPane.showMessageDialog(null, String.format("%.2f x %.2f = %.2f", a[cont], b[cont], c[cont]));

    }

    public static void impar(int cont, double[] a, double[] b){
        double c[] = new double[5];

        c[cont] = Math.pow(a[cont], b[cont]);

        JOptionPane.showMessageDialog(null, String.format("%2.2f ^ %2.2f = %2.2f", a[cont], b[cont], c[cont]));

    }

    public static void menu(){

        String resp = JOptionPane.showInputDialog(null, "Deseja continuar[s/n]: ");

        if (resp.equals("s")){

            receberValor();

        }

    }

    public static void main(String[] args) {

        receberValor();

    }
}


