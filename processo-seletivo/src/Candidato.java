import java.util.Random;

public class Candidato {
    
    String nome;
    double pretensao;

    public Candidato(String nome, double pretensao) {
        this.nome = nome;
        this.pretensao = pretensao;
    }

    public boolean ligar() {
        int tentativas = 0;
        
        do {
            System.out.println(tentativas + " - Ligando para " + this.nome + "...");
            tentativas++;
            if (atendeu()) {
                System.out.println("A ligação foi atendida na " + tentativas + "ª tentativa :)");
                return true;
            }
        } while (tentativas < 3);

        System.out.println("Não conseguimos contato com " + this.nome + " :(");
        return false;
    }
    
    // public int salarios(double base) {
    //     if! (this.pretensao < base) return 1;
    // }
 
    private boolean atendeu() {
        return new Random().nextBoolean();
    }

}