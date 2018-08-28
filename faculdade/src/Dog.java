import javax.swing.*;

public class Dog {
    public static void main(String[] args) {
        latir();
    }
    // quando uso static nao preciso criar o objeto da classe
    public static void latir(){
        JOptionPane.showMessageDialog(null, "Au! Au!");
    }
}
