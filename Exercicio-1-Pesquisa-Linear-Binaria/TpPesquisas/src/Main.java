import Model.searchBinaria;
import Model.searchLinear;

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        int qtdNumeros = Integer.parseInt(JOptionPane.showInputDialog("Quantos números ira cadastrar?"));

        int[] insertNum = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros ; i++) {
            insertNum[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe os números: "));
        }

        Arrays.sort(insertNum);

        JOptionPane.showMessageDialog(null, "Os números informados foram ordenados em ordem" +
                "crescente e o array ficou assim: "
        + Arrays.toString(insertNum));

        String[] tipoPesquisa = {"Linear", "Binaria"};

        int selectPesquisa = JOptionPane.showOptionDialog(null,"Escolha um método de pesquisa: ",
                "Opções:", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipoPesquisa,
                tipoPesquisa[0]);

        int numPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Qual será o número pesquisado?"));

        int posicao = -1;

        switch (selectPesquisa) {
            case 0:
                searchLinear linear = new searchLinear();
                posicao = linear.linearSearch(insertNum, numPesquisa);
                if (posicao == -1){
                    JOptionPane.showMessageDialog(null, "O número não foi encontrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número foi encontrado na posição:"
                    + posicao);
                }
                break;
            case 1:
                searchBinaria binaria = new searchBinaria();
                posicao = binaria.binarySearch(insertNum, numPesquisa);
                if (posicao == -1){
                    JOptionPane.showMessageDialog(null, "O número não foi encontrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "O número foi encontrado na posição:"
                            + posicao);
                }
                break;
        }

    }
}
