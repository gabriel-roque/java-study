package herancaSimples;

public class Carro extends Veiculo {

    private boolean limpadorParabrisa;
    private String tpTracao;

    public Carro(String combustivel, int rodas, int ano, String marca, boolean limpadorParabrisa, String tpTracao) {

        super(combustivel, rodas, ano, marca);
        this.limpadorParabrisa = limpadorParabrisa;
        this.tpTracao = tpTracao;

    }

    public boolean getLimpadorParabrisa() {
        return limpadorParabrisa;
    }

    public void setLimpadorParabrisa(boolean limpadorParabrisa) {
        this.limpadorParabrisa = limpadorParabrisa;
    }

    public String gettpTracao() {
        return tpTracao;
    }

    public void settpTracao(String tpTracao) {
        this.tpTracao = tpTracao;
    }
}
