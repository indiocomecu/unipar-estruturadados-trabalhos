package Model;

public class searchLinear {
    public static int linearSearch(int[] lista, int valor) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
