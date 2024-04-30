import java.util.Scanner;

/**
 * Essa classe simula o cliente usuário da conta.
  */
public class Cliente {
 public static void main(String[] args) {

        /**
         * Instância o objeto input responsável por ler 
         * as entradas do teclado.
         */
        Scanner input = new Scanner(System.in);
        
        /**
         * Lê cada um dos dados diplomados pelo usuário.
         */
        System.out.println("Informe o seu nome: ");
        String nome = input.nextLine();
        
        System.out.println("Informe o número da agência: ");
        String agencia = input.next();

        System.out.println("Informe o número da conta: ");
        int contaNumero = input.nextInt();

        System.out.println("Informe o saldo disponível: ");
        float saldo = input.nextFloat();

        /**
         * Instancia o objeto conta da classe ContaTerminal 
         * com os valores lidos acima como parâmetros.
          */
        ContaTerminal conta = new ContaTerminal(contaNumero, agencia, nome, saldo);

        /**
         * Limpa o input para não causar conflito em usos posteriores.
         */
        input.close();

        /**
         * Mostra no terminal o retorno do método toString da conta.
         */
        System.out.println(conta);
    }
}
