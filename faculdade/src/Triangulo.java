import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Altura: ");
        double altura = input.nextDouble();

        System.out.print("Base: ");
        double base = input.nextDouble();

        double area = (altura * base)/2;
        System.out.println("Area do triangulo: " + area);

    }
}
