import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();

        System.out.println("Sua idade e " + idade);


    }
}
