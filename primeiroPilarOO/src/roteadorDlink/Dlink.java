package roteadorDlink;

public class Dlink implements Roteador{
    private String nome;
    private boolean ligado;
    private boolean conexao;

    Dlink(){
        this.ligado = false;
        this.conexao = false;
    }

    //NOME DA REDE
    private String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    //LIGAR
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    //CONECTAR
    private boolean getConexao() {
        return conexao;
    }
    private void setConexao(boolean conexao) {
        this.conexao = conexao;
    }


    // METODOS DA INTERFACE
    public void ligar() {
        this.setLigado(true);
    }

    public void definirRede(String nome) {
        this.setNome(nome);
    }

    public void conectar() {
        this.setConexao(true);
    }


    public void statusRede(){
        System.out.println("Status do Router: " + this.getLigado());
        System.out.println("Nome da rede: " + this.getNome());
        System.out.println("Conectado: " + this.getConexao());
    }
}
