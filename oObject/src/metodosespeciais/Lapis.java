package metodosespeciais;

public class Lapis {
    public String marca;
    private int carga;

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public static void main(String[] args) {
        Lapis meuLp = new Lapis();

        meuLp.setMarca("BIC");
        System.out.println(meuLp.getMarca());
    }
}
