import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        /* Fica scaneando a entrada de dados
            Objeto Teclado para receber
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entrada de string: ");
        String nome = teclado.nextLine();

        System.out.println("Entrada de float: ");
        Float nota = teclado.nextFloat();

    }
}
