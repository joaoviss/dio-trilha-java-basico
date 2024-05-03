import java.util.Scanner;

/**
 * Essa classe simula um contador que recebe 2 números (a e b) digitados pelo usuário,
 * realiza a substrato do segundo número pelo primeiro Depois imprime me X vezes
 * O número de cada iteração, sendo X = b - a.
 * Uma exceção é lançada caso o valor de 'b' seja menor do que o de 'a'.
 * @author João Vitor dos Santos Silva
 */
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe 2 números inteiros");

        System.out.println("Primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.println("Segundo número: ");
        int valor2 = scanner.nextInt();

        scanner.close();
        
        try {
            int iteracoes = contar(valor1, valor2);

            System.out.println("Imprimindo " + iteracoes + " vezes...");

            for (int i = 0; i < iteracoes; i++) {
                System.out.print(" - " + (i+1));
            }
        } catch (ParametrosInvalidosException pie) {
            System.out.println(pie.getMessage());
        }
    }

    /**
     * Esse método auxiliar é responsável por fazer a subtração entre 
     * os valores e retornar o resultado. Lançando uma exceção caso o 
     * primeiro valor será maior do que o segundo.
     * @param valor1
     * @param valor2
     * @return A diferença entre os valores
     * @throws Exception
     */
    private static int contar(int valor1, int valor2) throws Exception {
        if (valor1 > valor2)
            throw new ParametrosInvalidosException(valor1, valor2);
        
        return valor2 -= valor1;
    }

}