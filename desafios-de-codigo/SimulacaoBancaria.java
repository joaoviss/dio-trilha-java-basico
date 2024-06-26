import java.util.Scanner;

public class SimulacaoBancaria {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        
        while(true) {
            // Scanner scanner = new Scanner(System.in);
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            
            int opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    double valorDeposito = scanner.nextInt();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                break;
                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else
                        System.out.println("Saldo insuficiente");
                break;
                case 3:
                        System.out.println("Saldo atual: " + saldo);
                break;  
                case 0:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
}