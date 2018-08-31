import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        /* Minha classe Scanner possui um método teclado que recebe
           o monitoramento de entrada de dados
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entrada de string: ");
        // neste ponto uma variavel nome do tipo Wrapper class, recebe a entrada de dados.
        String nome = teclado.nextLine();

        System.out.println("Entrada de float: ");
        Float nota = teclado.nextFloat();

    }
}
