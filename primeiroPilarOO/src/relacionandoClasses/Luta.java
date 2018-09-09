package relacionandoClasses;

import java.util.Random;

public class Luta {
    /* Tipo abstrato de dados ou seja:
     * estou dizendo que desafiado e uma instacia da classe lutador
     */

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2){

        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){

            this.aprovada = true;
            desafiado = l1;
            desafiante = l2;

        } else {

            this.aprovada = false;
            desafiante = null;
            desafiado = null;

        }

    }

    public void lutar(){

        if (this.aprovada){

            this.desafiado.apresetar();
            this.desafiante.apresetar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1, 2

            switch (vencedor){

                case 0: // EMPATA

                    System.out.println("Empatou");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();

                    break;

                case 1: // DESAFIADO GANHA

                    System.out.println("Ganhador: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();

                    break;

                case 2: // DESAFIANTE GANHA

                    System.out.println("Ganhador: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();

                    break;

            }

        }else{

            System.out.println("A luta nao pode ocorrer!");

        }

    }


        public Lutador getDesafiado() {
            return desafiado;
        }

        public void setDesafiado(Lutador desafiado) {
            this.desafiado = desafiado;
        }

        public Lutador getDesafiante() {
            return desafiante;
        }

        public void setDesafiante(Lutador desafiante) {
            this.desafiante = desafiante;
        }

        public int getRounds() {
            return rounds;
        }

        public void setRounds(int rounds) {
            this.rounds = rounds;
        }

        public boolean getAprovada() {
            return aprovada;
        }

        public void setAprovada(boolean aprovada) {
            this.aprovada = aprovada;
        }
}
