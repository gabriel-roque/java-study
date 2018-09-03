package caneta;
// CLASSE MAE
public class Caneta {
// ATRIBUTOS
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        protected boolean tampada;
//METODOS
        public void rabiscar(){
                if (this.tampada){
                        System.out.println("Estou tampada. Não posso rabiscar.");
                }
                else {
                        System.out.println("Estou rabiscando");
                }

        }

        protected void tampar(){
                this.tampada = true;

        }

        protected void destampar(){
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
