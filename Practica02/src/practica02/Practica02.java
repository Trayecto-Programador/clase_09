/**
 * Realice un programa que permita determinar la cantidad del bono navideño
 * que recibirá un empleado de una tienda, considerando que si su antigüedad
 * es mayor a cuatro años o su sueldo es menor de dos mil pesos,
 * le corresponderá 25 % de su sueldo, y en caso contrario sólo le corresponderá
 * 20 % de éste.
 */
package practica02;

import javax.swing.JOptionPane;

public class Practica02 {

    public static void main(String[] args) {
        int antiguedad, sueldo;
        double porcentaje1, porcentaje2, bono;
        boolean bandera;
        String opcion;

        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));
        antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su antiguedad"));
        porcentaje1 = 0.25;
        porcentaje2 = 0.20;
        bono = 0;
        bandera = false;

        do {
            if (sueldo < 2000 || antiguedad > 4) {
                bono = sueldo + sueldo * porcentaje1;
                System.out.println("El bono navideño a percibir es del " + porcentaje1 *100 + "%" + " Importe a percibir " + bono);
            } else {
                bono = sueldo + sueldo * porcentaje2;
                System.out.println("El bono navideño a percibir es del "  + + porcentaje2 *100 + "%" + " Importe a percibir " + bono);
            }
            opcion = JOptionPane.showInputDialog("Desea continuar cargando sueldo y antiguedad? Ingrese S / N");
            if (opcion.equalsIgnoreCase("S")) {
                bandera = true;
                sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su sueldo"));
                antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su antiguedad"));
            } else{
                bandera = false;
            }
                
                        

        } while (bandera);

    }

}
