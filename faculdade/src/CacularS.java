import java.math.*;

public class CacularS {

    public static void main(String[] args) {

        double i = 1;
        double tot = 0;
        double f1, f2 = 0;

        while (i <= 10){

            if(i % 2 == 0){

                f1 = i*i;
                tot += f1;
                System.out.println(i + "\n---\n" + f1 + "\n");

            }

            if(i % 2 == 1){

                f2 = i*i;
                tot += f2;
                System.out.println(i + "\n---\n" + f2 + "\n");

            }

            i++;

        }

        System.out.println("Resultado: " + tot);

    }
}
