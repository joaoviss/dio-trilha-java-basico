/**
 * Essa classe simula o funcionamento básico de uma Smart TV
 * @author João Vi+tor dos Santos Silva
 */
public class SmartTv {
    private int volume = 0;
    private int canal = 1;
    private boolean ligada = false;

    /**
     * Desliga a TV se ele estiver ligada ou liga se estiver desligada
     */
    public void ligar() {
        if (this.ligada) {
            this.ligada = false;
            System.out.println("A TV está desligada!");
        } else {
            this.ligada = true;
            System.out.println("A TV está ligada!");
        }
    }

    /**
     * Métodos que servem para manipular os atributos da TV
     */
    public void aumentarVolume() {
        this.volume++;
        System.out.println("O volume foi aumentado para: " + this.volume);
    }

    public void diminuirVolume() {
        System.out.println("O volume foi diminuído para: " + this.volume);
    }

    public void aumentarCanal() {
        this.canal++;
        System.out.println("O canal foi aumentado para: " + this.canal);
    }

    public void diminuirCanal() {
        this.canal--;
        System.out.println("O canal foi diminuído para: " + this.canal);
    }
}