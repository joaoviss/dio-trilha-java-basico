import java.util.Scanner;

public class VerificadorContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o número da conta:");
            String numeroConta = scanner.nextLine();
            if (checaConta(numeroConta))
                System.out.println("Número de conta válido!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static boolean checaConta(String numeroConta) {

        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Erro: Numero de conta invalido.\nDigite exatamente 8 digitos.");
        }
        return true;
    }
}