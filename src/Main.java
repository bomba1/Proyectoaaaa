import ucn.StdOut;

public class Main {

    public static void main(String[] args) {

        Calculadora c = new CalculadoraImpl();

        double resultado = c.division(1,0);

        StdOut.println(resultado);
    }

}