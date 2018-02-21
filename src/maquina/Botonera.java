package maquina;

import javax.swing.JOptionPane;
import static maquina.Maquina.euros;
import static maquina.Maquina.disp;
import static maquina.Maquina.producto;

/**
 *
 * @author acabezaslopez
 */
public class Botonera {

    //private static Producto prod;
    Producto otro = null;
    float credito, precio, cambio;
    String bebida;
    int op, azucar;
    int dialogButton = JOptionPane.YES_NO_OPTION;

    public Botonera() {
    }

    public void selMenu(int op) {

        switch (op) {
            case 1:
                credito = Float.parseFloat(JOptionPane.showInputDialog("Introduce credito : "));
                euros.introducirDinero(credito);

                break;
            case 2:
                bebida = disp.verBebida();
                seleccionBebida(bebida);
                disp.elabora();
                break;
            case 3:
                azucar = añadirAzucar();
                disp.verAzucar(azucar);
                break;
            case 4:
                cambio = euros.devolverCambio(credito,precio,otro);
                disp.verCambio();
                break;
            case 5:
                euros.devolverDinero(credito);
                disp.verCredito();
                break;
            case 6:
                System.exit(1);
                break;
        }

    }

    public Producto seleccionBebida(String bebida) {
        for (int i = 0; i < producto.size(); i++) {
            if (producto.get(i).getNome().equalsIgnoreCase(bebida)) {
                euros.mostrarPrecio(producto.get(i).getPrecio());
                otro = new Producto("producto.get(i).getNome()", producto.get(i).getPrecio());
            }
        }
        return otro;
    }

    public int añadirAzucar() {
        int cantidad = 0;
        String az;
        do {
            System.out.println("Más azucar: +\nMenos azucar: -\nSalir: s");
            az = JOptionPane.showInputDialog("¿Cuanto azúcar quieres ?", cantidad);

            if (az.equalsIgnoreCase("+")) {
                cantidad++;
                if (cantidad >= 7) {
                    cantidad = 7;
                }
            } else if (az.equalsIgnoreCase("-")) {
                cantidad--;
                if (cantidad <= 0) {
                    cantidad = 0;
                }
            }
        } while (!"s".equals(az));

        return cantidad;
    }
}
