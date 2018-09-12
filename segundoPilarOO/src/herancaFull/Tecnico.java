package herancaFull;

public final class Tecnico extends Aluno {

    private int regProfissional;


    public void praticar(){

        System.out.println("Tecnico praticando...");

    }


    public int getRegProfissional() {
        return regProfissional;
    }

    public void setRegProfissional(int regProfissional) {
        this.regProfissional = regProfissional;
    }
}
