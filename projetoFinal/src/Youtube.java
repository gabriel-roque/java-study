public class Youtube {
    public static void main(String[] args) {

        System.out.println("========== VIDEO =========");
        Video v1 = new Video("Aula 30 POO");
        System.out.println(v1.toString());

        System.out.println("\n========== USER =========");
        Gafanhoto g1 = new Gafanhoto("Lucas", 20, "M", "lukao10");
        v1.play();
        v1.like();
        System.out.println(g1.toString());


        System.out.println("\n========== VISUALIZACAO =========");
        Visualizacao vis = new Visualizacao(g1, v1);
        vis.avaliar(6);
        System.out.println(vis.toString());


    }
}
