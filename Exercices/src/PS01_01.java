import java.util.Arrays;
import java.util.Scanner;

public class PS01_01 {
    public static void main(String[] args) throws Exception {

        class MultiplicacaoMatrizes {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
            
                // Requisito 01: informar tamanho e elementos das matrizes
                System.out.print("Informe o número de linhas da matriz A: ");
                int linhasA = sc.nextInt();
                System.out.print("Informe o número de colunas da matriz A: ");
                int colunasA = sc.nextInt();
                int[][] matrizA = new int[linhasA][colunasA];
                for (int i = 0; i < linhasA; i++) {
                    for (int j = 0; j < colunasA; j++) {
                        System.out.printf("Informe o elemento [%d][%d] da matriz A: ", i, j);
                        matrizA[i][j] = sc.nextInt();
                    }
                }
            
                System.out.print("Informe o número de linhas da matriz B: ");
                int linhasB = sc.nextInt();
                System.out.print("Informe o número de colunas da matriz B: ");
                int colunasB = sc.nextInt();
                int[][] matrizB = new int[linhasB][colunasB];
                for (int i = 0; i < linhasB; i++) {
                    for (int j = 0; j < colunasB; j++) {
                        System.out.printf("Informe o elemento [%d][%d] da matriz B: ", i, j);
                        matrizB[i][j] = sc.nextInt();
                    }
                }
            
                // Requisito 02: verificar se é possível efetuar a multiplicação das matrizes
                if (colunasA != linhasB) {
                    System.out.println("Não é possível efetuar a multiplicação das matrizes.");
                    return;
                }
            
                // Requisito 03: efetuar o cálculo da multiplicação entre as matrizes
                int[][] matrizC = new int[linhasA][colunasB];
                for (int i = 0; i < linhasA; i++) {
                    for (int j = 0; j < colunasB; j++) {
                        for (int k = 0; k < colunasA; k++) {
                            matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                        }
                    }
                }
                
                // Exibir as matrizes e seus conteúdos
                System.out.println("Matriz A\tMatriz B");
                for (int i = 0; i < linhasA; i++) {
                    for (int j = 0; j < colunasA; j++) {
                        System.out.printf("%d ", matrizA[i][j]);
                    }
                    System.out.print("\t\t");
                    for (int j = 0; j < colunasB; j++) {
                        System.out.printf("%d ", matrizB[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("Matriz resultante:");
                for (int[] linha : matrizC) {
                    System.out.println(Arrays.toString(linha));
                }
            }
        }
        // chamada ao método main da classe MultiplicacaoMatrizes
        MultiplicacaoMatrizes.main(args);
    }
}