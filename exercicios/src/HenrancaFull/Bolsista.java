package HenrancaFull;

public final class Bolsista extends Aluno{

    private int bolsa;

    public void renovarBolsa(){

        System.out.println("Bolsista renovando bolsa de estudos");

    }


    @Override
    public void pagarMensalidade(){

        System.out.println("Bolsista pagando mensalidade");

    }


    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
