package maquina;

import javax.swing.JOptionPane;

/**
 *
 * @author acabezaslopez
 */
public class Display {

    int az;
    //float credito;

    public Display() {
    }

    public int verMenu() {
        System.out.println("\n\n\n*******-MENU-*******\n1)Introducir dinero\n2)Selección bebida\n3)Selección azúcar\n4)Devolver cambio\n5)Devolver crédito\n6)Salir\n");
        int op = Integer.parseInt(JOptionPane.showInputDialog("Selecciona la opción de menú: "));
        return op;

    }

    public String verBebida() {
        String bebida = null;
        System.out.println("\n\n*******-BEBIDAS-*******\n1)Expreso \n2)Café con leche \n3)Capuccino \n4)Manchiatto "
                + "\n5)Chocolate \n6)Chocolate con leche\n7)Té "
                + "\n8)Té con limón \n9)Manzanilla \n10)Poleo Menta \n11)Tila\n");
        bebida = JOptionPane.showInputDialog("\nSeleccione la bebida que desea tomar :", bebida);
        switch (Integer.parseInt(bebida)) {
            case 1:
                bebida = "Expreso";
                break;
            case 2:
                bebida = "Café con leche";
                break;
            case 3:
                bebida = "Capuccino";
                break;
            case 4:
                bebida = "Manchiatto";
                break;
            case 5:
                bebida = "Chocolate";
                break;
            case 6:
                bebida = "Chocolate con leche";
                break;
            case 7:
                bebida = "Té ";
                break;
            case 8:
                bebida = "Té con limón";
                break;
            case 9:
                bebida = "Manzanilla";
                break;
            case 10:
                bebida = "Poleo Menta";
                break;
            case 11:
                bebida = "Tila";
                break;

        }
        System.out.println("Ha elegido : " + bebida);
        return bebida;
    }

    public void verAzucar(int az) {
        switch (az) {
            case 1:
                System.out.println("Nivel de azúcar :\t" + (char) 27 + "[34;43m*");
                break;
            case 2:
                System.out.println("Nivel de azúcar :\t" + (char) 27 + "[34;43m**");
                break;
            case 3:
                System.out.println("Nivel de azúcar :\t" + (char) 27 + "[34;43m***");
                break;
            case 4:
                System.out.println("Nivel de azúcar :\t" + (char) 27 + "[35;46m****");
                break;
            case 5:
                System.out.println("Nivel de azúcar :\t" + (char) 27 + "[35;46m*****");
                break;
        }

    }

    /**
     *
     */
    public void elabora() {

        System.out.println("\nProducto en proceso de elaboración..............\n");
        // Maquina.prod.wait(20);

        System.out.println("Recoga su bebida, cuidado no se queme .\n");

    }
/**
 * 
 */
    public void verCambio() {
        System.out.println(Dinero.getCambio() + "euros");
    }
/**
 * 
 */
    public void verCredito() {
        System.out.println(Dinero.getCredito() + "euros");
    }

}
