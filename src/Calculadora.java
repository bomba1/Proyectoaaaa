/**
 * Interfaz que representa la definicion de una calculadora
 */
public interface Calculadora {

    /**
     * Metodo que retorna la suma de x + y
     * @param x Primer sumando
     * @param y Segundo sumando
     * @return
     */
    public int sumar(int x, int y);

    /**
     * Retorna la resta entre x - y
     * @param x Numero a restar
     * @param y Numero que resta
     * @return
     */
    public int restar(int x, int y);

    /**
     * Retorna la multiplicacion de x * y
     * @param x Primer producto
     * @param y Segundo producto
     * @return
     */
    public double multiplicacion(double x, double y);

    /**
     * Retorna la division de x/y
     * @param x Dividendo
     * @param y Divisor
     * @return
     */
    public double division(double x, double y);
}
