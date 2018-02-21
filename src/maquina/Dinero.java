package maquina;

import static maquina.Maquina.prod;

/**
 *
 * @author acabezaslopez
 */
public class Dinero {

    private static float credito;
    private static float precio;
    private static float cambio;

    public Dinero() {

    }

    /**
     *
     * @return
     */
    public static float getCredito() {
        return credito;
    }

    /**
     *
     * @param credito
     */
    public static void setCredito(float credito) {
        Dinero.credito = credito;
    }

    /**
     *
     * @return
     */
    public static float getPrecio() {
        return precio;
    }

    /**
     *
     * @param precio
     */
    public static void setPrecio(float precio) {
        Dinero.precio = precio;
    }

    /**
     *
     * @return
     */
    public static float getCambio() {
        return cambio;
    }

    /**
     *
     * @param cambio
     */
    public static void setCambio(float cambio) {
        Dinero.cambio = cambio;
    }

    /**
     *
     * @param dinero
     */
    public void introducirDinero(float dinero) {
        Dinero.credito += dinero;
    }

    /**
     *
     * @param precio
     */
    public void mostrarPrecio(float precio) {

        System.out.println("son " + precio + " euros");
    }

    /**
     *
     * @param dinero
     * @return
     */
    public float devolverDinero(float dinero) {

        return credito;
    }

    /**
     *
     * @param credito
     * @param precio
     * @param otro
     * @return
     */
    public float devolverCambio(float credito, float precio, Producto otro) {

        cambio = credito - otro.getPrecio();
        return cambio;

    }
}
