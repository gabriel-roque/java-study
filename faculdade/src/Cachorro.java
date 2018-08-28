import javax.swing.*;

public class Cachorro {
    public static void main(String[] args) {
        //objeto meuDog monitora os metodos da minha Classe Cachorro
        Cachorro meuDog = new Cachorro();
        //meu objeto meuDog requsita
        meuDog.latir();
        meuDog.andar();
        meuDog.comer();

    }

    //quando nao uso static tenho criar Objeto da classe

    public void latir(){
        JOptionPane.showMessageDialog(null,"Au Au!");
    }

    public void andar(){
        JOptionPane.showMessageDialog(null,"Estou andando!");
    }

    public void comer(){
        JOptionPane.showMessageDialog(null,"Estou comendo!");
    }
}