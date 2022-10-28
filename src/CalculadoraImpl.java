/**
 * Clase implementadora de calculadora
 */
public class CalculadoraImpl implements Calculadora {

    @Override
    public int sumar(int x, int y) {
        return x+y;
    }

    @Override
    public int restar(int x, int y) {
        return x-y;
    }

    @Override
    public double multiplicacion(double x, double y) {
        return x*y;
    }

    /**
     * Retorna divison de x/y
     * @param x Dividendo
     * @param y Divisor
     * @return
     */
    @Override
    public double division(double x, double y) {

        if (y == 0) {
            throw new IllegalArgumentException("Error, divisor igual a 0");
        }
        return x/y;
    }
}
