package maquina;

import java.util.ArrayList;

/**
 *
 * @author acabezaslopez
 */
public class Maquina {

    static ArrayList<Producto> producto = new ArrayList<>();
    private static int azucar;
    static Producto prod = new Producto();
    static Display disp = new Display();
    static Botonera boton = new Botonera();
    static Dinero euros = new Dinero();
    static final int EXPRESO = 1;
    static final int CAFE_CON_LECHE = 2;
    static final int CAPUCCINO = 3;
    static final int MACHIATTO = 4;
    static final int CHOCOLATE = 5;
    static final int CHOCOLATE_CON_LECHE = 6;
    static final int TE = 7;
    static final int TE_AL_LIMON = 8;
    static final int MANZANILLA = 9;
    static final int POLEO_MENTA = 10;
    static final int TILA = 11;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        producto.add(new Producto("Expreso", (float) 0.80));
        producto.add(new Producto("Café con leche", 1));
        producto.add(new Producto("Capuccino", 1));
        producto.add(new Producto("Machiatto", (float) 0.85));
        producto.add(new Producto("Chocolate", (float) 1));
        producto.add(new Producto("Chocolate con leche", (float) 1));
        producto.add(new Producto("Té", (float) 0.90));
        producto.add(new Producto("Té con limón", 1));
        producto.add(new Producto("Manzanilla", (float) 0.90));
        producto.add(new Producto("Poleo Menta", (float) 0.90));
        producto.add(new Producto("Tila", (float) 0.90));

        // opcion = disp.verMenu();
        do {
            opcion = disp.verMenu();
            boton.selMenu(opcion);
            //opcion = disp.verMenu();
        } while (opcion < 6);
        //boton.selMenu(opcion);
    }
}
