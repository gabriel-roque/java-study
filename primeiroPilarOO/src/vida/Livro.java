package vida;

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPags;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    Livro (String titulo, String autor, int totPags, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPags = totPags;
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", totPags=" + totPags +
                ", pagAtual=" + pagAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }

    public String getTitulo() {

            return titulo;

        }

        public void setTitulo(String titulo) {

            this.titulo = titulo;

        }


        public String getAutor() {

            return autor;

        }

        public void setAutor(String autor) {

            this.autor = autor;

        }


        public int getTotPags() {

            return totPags;

        }

        public void setTotPags(int totPags) {

            this.totPags = totPags;

        }


        public int getPagAtual() {

            return pagAtual;

        }

        public void setPagAtual(int pagAtual) {

            this.pagAtual = pagAtual;

        }


        public boolean getAberto() {

            return aberto;

        }

        public void setAberto(boolean aberto) {

            this.aberto = aberto;

        }


        public String getLeitor() {

            return leitor;

        }

        public void setLeitor(String leitor) {

            this.leitor = leitor;

        }



}
