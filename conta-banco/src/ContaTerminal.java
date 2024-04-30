/**
 * Essa classe representa uma conta bancária
 * @author João Vitor dos Santos Silva
 */
public class ContaTerminal {

    private int contaNumero;
    private String agencia;
    private String nome;
    private float saldo;

    /**
     * Esse é o método construtor, 
     * executado automaticamente quando o objeto é instanciado.
     */
    public ContaTerminal(int contaNumero, String agencia, String nome, float saldo) {
        this.contaNumero = contaNumero;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    /** 
     * Esse é o método toString da classe object reescrito especialmente para essa
     * formatar uma string que representa o objeto.
     * @return Um resumo sobre a doação da conta
     */
    public String toString() {
        return """
            Olá %s, obrigado por criar uma conta em nosso banco,
            sua agência é %s, conta %d 
            e seu saldo %f já está disponível para saque!\n"""
            .formatted(nome, agencia, contaNumero, saldo);
    }
}

