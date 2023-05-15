package Model;

public class searchBinaria{
    public static int binarySearch(int[] lista, int valor) {
        int esquerda = 0;
        int direita = lista.length - 1;
        while (esquerda <= direita) {
            int meio = (esquerda + direita) / 2;
            if (lista[meio] == valor) {
                return meio;
            } else if (lista[meio] < valor) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }
}
