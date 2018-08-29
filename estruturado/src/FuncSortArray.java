import java.util.Arrays;

public class FuncSortArray {
    public static void main(String[] args) {
        int vet[] = {123, 16, 29, 1, 33, 25};

        for(int valor:vet){
            System.out.print(valor + " ");
        }
        // classe Arrays tem metodo para ordenar array .sort
        Arrays.sort(vet);
        System.out.println("\n");

        for(int valor:vet){
            System.out.print(valor + " ");
        }

    }
}
