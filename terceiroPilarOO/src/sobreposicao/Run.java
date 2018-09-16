package sobreposicao;

public class Run {
    public static void main(String[] args) {

     Cachorro dog = new Cachorro();
     Canguru can = new Canguru();

     dog.locomover();
     can.locomover();

     dog.emitirSom();
     can.emitirSom();

    }

}
