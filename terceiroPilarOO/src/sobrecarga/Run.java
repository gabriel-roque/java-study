package sobrecarga;

public class Run {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();

        dog.reagir("Ola");
        dog.reagir("Vai Apanhar!");
        dog.reagir(11, 45);
        dog.reagir(21, 0);
        dog.reagir(true);
        dog.reagir(false);
        dog.reagir(2, 12.5f);
        dog.reagir(17, 4.5f);
    }

}
