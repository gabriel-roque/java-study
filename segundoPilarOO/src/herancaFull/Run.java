package herancaFull;

public class Run {

    public static void main(String[] args) {


        Aluno a1 = new Aluno();
        a1.setNome("Lucas");

        Bolsista b1 = new Bolsista();
        b1.setNome("Gabriel");

        a1.pagarMensalidade();
        b1.pagarMensalidade();



    }
}
