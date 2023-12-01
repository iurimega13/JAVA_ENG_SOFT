import java.util.Scanner;

/**
 * Esta classe implementa uma calculadora com operações básicas e algumas constantes matemáticas.
 * Ela permite realizar operações de soma, subtração, multiplicação, divisão, potência e obter
 * valores de Pi, Phi e E (número de Euler).
 *
 * @see <a href="https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html">Documentação JavaDoc</a>
 * @author SeuNome
 * @version 1.0
 */
public class CalculadoraEstruturada {

    /**
     * Método principal que executa a calculadora.
     *
     * @param args Argumentos passados pela linha de comando (não utilizado neste programa)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double operandoA, operandoB, resultado;
        operandoA = operandoB = resultado = 0;
        char operacao;

        System.out.println("Escolha a operação: ");
        System.out.println("Soma______________: + ");
        System.out.println("Subtração_________: - ");
        System.out.println("Multiplicação_____: * ");
        System.out.println("Divisão___________: / ");
        System.out.println("Potência__________: ^ ");
        System.out.println("Valor de Pi_______: p ");
        System.out.println("Valor de PHI______: f ");
        System.out.println("Valor de e________: e ");
        System.out.println("----------------------");
        System.out.println("Sair______________: s \n");
        System.out.println();

        operacao = sc.next().charAt(0);

        if (operacao == 's') {
            // Se a operação for 's', o programa termina sem fazer nada.
        } else if (operacao == 'p') {
            resultado = getPi();
            System.out.printf("pi= %.2f ", resultado);
        } else if (operacao == 'f') {
            resultado = getFi();
            System.out.printf("phi= %.2f ", resultado);
        } else if (operacao == 'e') {
            resultado = getE();
            System.out.printf("e= %.2f ", resultado);
        } else if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/' || operacao == '^') {
            System.out.println("Operando A: ");
            operandoA = sc.nextDouble();
            System.out.println("Operando B: ");
            operandoB = sc.nextDouble();
            resultado = operacoesBasicas(operandoA, operacao, operandoB);
            System.out.printf("%.2f %c %.2f = %.2f", operandoA, operacao, operandoB, resultado);
        }
    }

    /**
     * Realiza operações básicas (soma, subtração, multiplicação, divisão, potência).
     *
     * @param x         O primeiro operando
     * @param operador  O operador a ser aplicado (+, -, *, /, ^)
     * @param y         O segundo operando
     * @return O resultado da operação
     */
    public static double operacoesBasicas(double x, char operador, double y) {
        double resultado = 0.0;
        switch (operador) {
            case '+':
                resultado = x + y;
                break;
            case '-':
                resultado = x - y;
                break;
            case '*':
                resultado = x * y;
                break;
            case '/':
                resultado = x / y;
                break;
            case '^':
                resultado = Math.pow(x, y);
        }
        return resultado;
    }

    /**
     * Obtém o valor de Pi.
     *
     * @return O valor de Pi (3.14159265358979323846)
     */
    public static double getPi() {
        return Math.PI;
    }

    /**
     * Obtém o valor de E (número de Euler).
     *
     * @return O valor de E (2.7182818284590452354)
     */
    public static double getE() {
        return Math.E;
    }

    /**
     * Obtém o valor de Phi.
     *
     * @return O valor de Phi (1.61803398874989484820)
     */
    public static double getFi() {
        return 1.61803398874989484820;
    }
}
