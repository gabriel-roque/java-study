import java.awt.Toolkit;
import java.awt.Dimension;

public class Resolucao{
    public static void main(String[] args) {
        //kit de ferrementas
        Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        //biblioteca para obter a resolução
        Dimension d = tk.getScreenSize();

        System.out.println("Resolução do Monitor " + d.width + " x " + d.height);


    }
}
