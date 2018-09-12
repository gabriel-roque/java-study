package heranca;

public class Professor extends Pessoa {

    private String especialidade;
    private double salaraio;


    public void receberAum(double salaraio){

        this.salaraio += salaraio;

    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalaraio() {
        return salaraio;
    }

    public void setSalaraio(double salaraio) {
        this.salaraio = salaraio;
    }
}
