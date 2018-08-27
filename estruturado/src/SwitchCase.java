import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Integer valor = input.nextInt();

        switch (valor) {
            case 1:
                System.out.println("OP 01");
                break;
            case 2:
                System.out.println("OP 02");
                break;
            case 3:
                System.out.println("OP 03");
                break;
            default:
                System.out.println("Nao escolheu nenhuma das 3 OPs");

        }
    }

}
