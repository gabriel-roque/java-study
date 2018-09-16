public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {

        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1 );
        this.filme.setViews(this.filme.getViews() + 1);

    }


    public void avaliar(){

        this.filme.setAvaliacao(5);

    }

    public void avaliar(int nota){

        this.filme.setAvaliacao(nota);

    }


    private Gafanhoto getEspectador() {
        return espectador;
    }

    private void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }


    private Video getFilme() {
        return filme;
    }

    private void setFilme(Video filme) {
        this.filme = filme;
    }


    @Override
    public String toString() {
        return "Visualizacao{" +
                "espectador=" + espectador +
                ", \nfilme=" + filme +
                '}';
    }
}
