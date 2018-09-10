package relacionandoClasses;

public class Lutador {

    private String nome;
    private String nacionanlidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
 

    Lutador(String nome, String nasc, int idade, double altura, double peso, int vitorias, int derrotas, int empates){

        this.nome = nome;
        this.nacionanlidade = nasc;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;

    }

    public void apresetar(){

        System.out.println("==============================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getNacionanlidade());
        System.out.println("Idade: " +  this.getIdade());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("==============================");

    }

    public void status(){

        System.out.println("==============================");
        System.out.println(this.getNome());
        System.out.println("e um peso " + this.getCategoria());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("==============================");

    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }


    // NOME

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

    // NACIONALIDADE

        public String getNacionanlidade() {
            return nacionanlidade;
        }

        public void setNacionanlidade(String nacionanlidade) {
            this.nacionanlidade = nacionanlidade;
        }

    // IDADE

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

    // ALTURA

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

    // PESO

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            this.peso = peso;
            this.setCategoria();
        }

    // CATEGORIA

        public String getCategoria() {
            return categoria;
        }

        private void setCategoria() {

            if (peso < 52.2) {
                this.categoria = "Invalido";
            }

            else if (peso <= 70.3){
                this.categoria = "Leve";
            }

            else if (peso <= 83.9){
                this.categoria = "Medio";
            }

            else if (peso <= 120.2){
                this.categoria = "Pesado";
            }

        }

    // VITORIAS

        public int getVitorias() {
            return vitorias;
        }

        public void setVitorias(int vitorias) {
            this.vitorias = vitorias;
        }

    // DERROTAS

        public int getDerrotas() {
            return derrotas;
        }

        public void setDerrotas(int derrotas) {
            this.derrotas = derrotas;
        }

    // EMPATES

        public int getEmpates() {
            return empates;
        }

        public void setEmpates(int empates) {
            this.empates = empates;
        }

}
