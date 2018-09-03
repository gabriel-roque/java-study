package Caneta;
// CLASSE MAE
public class Caneta {
// ATRIBUTOS
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;
//METODOS
        void rabiscar(){
                if (this.tampada){
                        System.out.println("Estou tampada");
                }
                else {
                        System.out.println("Estou rabiscando");
                }

        }

        void tampar(){
                this.tampada = true;

        }

        void destampar(){
                this.tampada = false;

        }

        void status(){
                System.out.println("Modelo da caneta: " + this.modelo);
                System.out.println("Cor da caneta: " + this.cor);
                System.out.println("Ponta da caneta: " + this.ponta);
                System.out.println("Carga da caneta: " + this.carga);
                System.out.println("Esta tampada? " + this.tampada);
        }

}
