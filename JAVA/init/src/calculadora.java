/**
 * @author iuri de araujo
 * @version 2.0
 * @since 2023-10-12
 * Esta classe é uma calculadora
 */

import java.util.Scanner;
//Calculadora de CLI com tratamento de erros
public class calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado;
        char operador;
        boolean continuar = true;

        // Limpar a tela
        System.out.print("\033[H\033[2J");
        
        while (continuar) {
        System.out.println("+---------------------------+");
        System.out.println("| Calculadora de CLI        |");
        System.out.println("+---------------------------+");
        System.out.println("|  7  |  8  |  9  |  /  |   |");
        System.out.println("+---------------------------+");
        System.out.println("|  4  |  5  |  6  |  *  |   |");
        System.out.println("+---------------------------+");
        System.out.println("|  1  |  2  |  3  |  -  |   |");
        System.out.println("+---------------------------+");
        System.out.println("|  0  |  .  |  =  |  +  |   |");
        System.out.println("+---------------------------+");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o operador: ");
        operador = sc.next().charAt(0);
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();

        try {
            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("O resultado é: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("O resultado é: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("O resultado é: " + resultado);
                    break;
                case '/':
                    resultado = num1 / num2;
                    System.out.println("O resultado é: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido!");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        System.out.println("Deseja continuar? (S/N)");
        char resposta = sc.next().charAt(0);
        if (resposta == 'S' || resposta == 's') {
            continuar = true;
            // Limpar a tela
            System.out.print("\033[H\033[2J");
        } else {
            continuar = false;
            System.out.println("Obrigado por usar a calculadora!");
        }
        };
    };
};
