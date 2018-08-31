// Biblioteca de utilidade para localidades
import java.util.Locale;

public class Idioma {
    public static void main(String[] args) {
        //pego do sistema o idioma
        Locale locale = Locale.getDefault();

        System.out.println("O idioma do sistema é "+locale.getDisplayName());
    }
}
