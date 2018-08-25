public class TiposPrimitivos {
    public static void main(String[] args) {
        // declaraco comum sem especificacao

        int idade = 3;
        float sal = 1825.54f;
        char letra = 'G';
        boolean casado = false;


        // typecast - especificacao

        int idade = (int) 3;
        float sal = (float)1825.54;
        char letra = (char) 'G';
        boolean casado = (boolean) false;


        // OBJETO - Wrapper class

        Integer idade = new Integer(3);
        Float sal = new Float(1825.54);
        Character letra = new Character('G');
        String  nome = new String("Gabriel");
        Boolean casado = new Boolean(false);

    }
}
