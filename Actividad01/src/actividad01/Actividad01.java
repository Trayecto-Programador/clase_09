/**
 * Escribir un programa que pida al usuario una palabra 
 * y la muestre por pantalla 10.
veces

 */
package actividad01;

import javax.swing.JOptionPane;

public class Actividad01 {

    public static void main(String[] args) {
String cadena;
int cantidadRepeticion, impresionPalabra;
cantidadRepeticion =10;
impresionPalabra =1;

cadena = JOptionPane.showInputDialog("Ingrese una palabra");

        do {
            System.out.println(impresionPalabra + ".- "+ cadena);
            impresionPalabra ++;
        } while (impresionPalabra <= cantidadRepeticion);
        
    }
    
}
