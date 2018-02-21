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

    public static float getCredito() {
        return credito;
    }

    public static void setCredito(float credito) {
        Dinero.credito = credito;
    }

    public static float getPrecio() {
        return precio;
    }

    public static void setPrecio(float precio) {
        Dinero.precio = precio;
    }

    public static float getCambio() {
        return cambio;
    }

    public static void setCambio(float cambio) {
        Dinero.cambio = cambio;
    }

    public void introducirDinero(float dinero) {
        Dinero.credito += dinero;
    }

    public void mostrarPrecio(float precio) {

        System.out.println("son " + precio + " euros");
    }

    public float devolverDinero(float dinero) {

        return credito;
    }

    public float devolverCambio(float credito, float precio, Producto otro) {

        cambio = credito - otro.getPrecio();
        return cambio;

    }
}
