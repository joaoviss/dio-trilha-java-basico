public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(int valor1, int valor2) {
        super("O segundo número (" + valor2 + ") deve ser maior que o primeiro (" + valor1 + ")!");
    }

}