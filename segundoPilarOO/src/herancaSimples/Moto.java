package herancaSimples;

public class Moto extends Veiculo{

    private boolean bagageiro;
    private boolean pedal;


    public Moto(String combustivel, int rodas, int ano, String marca, boolean bagageiro, boolean pedal) {

        super(combustivel, rodas, ano, marca);
        this.bagageiro = bagageiro;
        this.pedal = pedal;

    }


    public boolean getBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    public boolean getPedal() {
        return pedal;
    }

    public void setPedal(boolean pedal) {
        this.pedal = pedal;
    }
}
