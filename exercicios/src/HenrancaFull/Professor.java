package HenrancaFull;

public class Professor {

    private String especialidade;
    private double Salario;

    public void receberrAumento(){

        System.out.println("Professor recebendo aumento de salrio em 10%");

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
