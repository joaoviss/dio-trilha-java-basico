import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

/**
 * Essa classe simula um processo seletivo no qual os candidats são avaliados1 com base 
 * em sua pretensão salarial, a qual deve condizer com o salário base estipulado.
 */
public class App {

    public static void main(String[] args) throws Exception {
        double SALARIOBASE = 2000.0;
        ArrayList<Candidato> listaDeCandidatos = geraLista();
        final ArrayList<Candidato> listaDeCandidatosSelecionados = new ArrayList<Candidato>();

        for (Candidato candidato : listaDeCandidatos) {
            System.out.println("/-------------------------------------------------");
            System.out.println("Analisando a pretensão salarial de " + candidato.nome);
            if (candidato.pretensao < SALARIOBASE) {
                System.out.println("A pretensão salarial do candidato condiz com o salário base do cargo.");
                System.out.println("LIGAR PARA O CANDIDATO.");
                    candidato.ligar();
                    if (listaDeCandidatosSelecionados.size() < 5)
                        listaDeCandidatosSelecionados.add(candidato);
                } else if (candidato.pretensao == SALARIOBASE) {
                    System.out.println("A pretensão salarial do candidato iguala ao salário base do cargo.");
                    System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
                    candidato.ligar();
            } else {
                System.out.println("A pretensão salarial do candidato não condiz com o salário base do cargo.");
                System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
            }
        }

        System.out.println("/----------------------------------------------");
        System.out.println("Aguarde pela impressão da lista de candidatos selecionados...");
        Thread.sleep(3000);
        imprimeSelecionados(listaDeCandidatosSelecionados);
    }
    
    /**
     * Esse método auxiliar retorna uma lista de candidatos com 
     * os nomes que estão na array e pretensão salarial aleatória.
     * @return Uma ArrayList de Candidato
     */
    private static ArrayList<Candidato> geraLista() {
        
        String[] nomes = {"ANA", "NAIR", "BIA", "CARLOS", "CIRO", "DANIEL", "OTÁVIO", "PAULO", "QUITERIA", "RAFAEL", "ERLANE", "RAVI", "FABIO", "ROBERTO", "GABRIELA", "SÂMIA", "HELIO", "SANDRA", "IGOR", "TADEU", "JOÃO", "UANA", "LUNA", "MARINA", "MIGUEL", "VELMA", "WILLIAN", "ZAQUEL"};
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
        
        for (String nome : nomes) {
            candidatos.add(new Candidato(nome, geraValor()));
        }
        return candidatos;
    }

    /**
     * @return um valor double aleatório entre 1700 a 2300.
     */
    private static double geraValor() {
        Random r = new Random();
        double valorRandom = r.nextDouble(600) + 1700;
        String valorString = String.format(Locale.US, "%.2f", valorRandom);
        return Double.parseDouble(valorString);
    }

    /**
     * Esse método auxiliar empenho e a lista os candidatos aprovados
     * @param lista Lista de candidatos a imprimir.++
     */
    private static void imprimeSelecionados(ArrayList<Candidato> lista) {
        System.out.println("/-------------------------------------------------");
        System.out.println("Imprimindo a lista de Candidatos Selecionados:");
        for (Candidato candidato : lista) {
            System.out.println(candidato.nome + " => R$" + candidato.pretensao);
        }
    }
}
