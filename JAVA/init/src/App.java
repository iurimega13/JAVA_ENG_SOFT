/** 
 * Codigo inicial para o curso de Java.
 * @author Iuri de Araujo
 * @version 1.0
 * @since 2023-10-12
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, World!");
        System.out.println("Tentando reaprender a programar em Java.");

        // Exemplo de declaração de constante
        final int MINHA_CONSTANTE = 10;

        // Exemplos de declaração de variáveis
        int idade = 30;
        double preco = 2.99;
        boolean estaChovendo = true;
        String nome = "João";
        char letra = 'a';
        float altura = 1.75f;
        long populacao = 1000000L;
        byte idadeByte = 25;
        short temperatura = -10;

        // Exemplos de declaração de arrays e matrizes
        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        int[][] matriz = new int[3][4];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][0] = 5;
        matriz[1][1] = 6;
        matriz[1][2] = 7;
        matriz[1][3] = 8;
        matriz[2][0] = 9;
        matriz[2][1] = 10;
        matriz[2][2] = 11;
        matriz[2][3] = 12;

        // Exemplos de operadores lógicos
        boolean a = true;
        boolean b = false;
        boolean c = a && b; // c é false
        boolean d = a || b; // d é true
        boolean l = !a; // e é false
        boolean f = a ^ b; // f é true

        // Exemplo de deslocamento de bits
        int g = 5; // valor binário: 00000101
        int h = g << 1; // valor binário: 00001010 (valor decimal: 10)
        int i = 10; // valor binário: 00001010
        int j = i >> 1; // valor binário: 00000101 (valor decimal: 5)

        // Exemplo de estrutura try-catch-finally
        try {
            int k = 10 / 0; // gera uma exceção de divisão por zero
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Deu certo!.");
        }

        // Exemplo de entrada de dados e saida de dados
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("O número digitado foi: " + numero);
    }
}
