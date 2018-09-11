package biblioteca;

public class Main {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Gabriel", 19, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo Java", "Rufus", 350, p[0]);
        l[1] = new Livro("POO", "Lucas M.", 500, p[1]);
        l[2] = new Livro("Java Web", "Rebeca L.", 320, p[0]);

        System.out.println(l[0].detalhes());

    }
}
