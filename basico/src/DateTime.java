//biblioteca de data
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {

        //relogio é objeto
        Date relogio = new Date();
        // quando tem a palavra NEW é um objeto

        System.out.println("A hora do sistema é: ");

        //convete data em String
        System.out.println(relogio.toString());
    }

}
