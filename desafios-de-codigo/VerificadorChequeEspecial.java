import java.util.NoSuchElementException;
import java.util.Scanner;

public class VerificadorChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = scanner.nextDouble();
        double cheque = 500;
        try {
            do {
                double valor = scanner.nextDouble();
                if (valor < saldo) {
                    saldo -= valor;
                    System.out.println("Transacao realizada com sucesso.");
                } else if (valor < saldo + cheque) {
                    saldo -= valor;
                    System.out.println("Transacao realizada com sucesso. Utilizando cheque especial.");
                } else 
                    System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            } while (saldo > 0);
            scanner.close();
        } catch(NoSuchElementException e) {}
    }
}