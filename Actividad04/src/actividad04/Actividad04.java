/**
 * Escribir un programa que pida al usuario un número entero y muestre por pantalla
 * un triángulo rectángulo como el de más abajo, de altura el número introducido.
*
**
***
****
*****
 */
package actividad04;

import javax.swing.JOptionPane;


public class Actividad04 {

   
    public static void main(String[] args) {
       
       //Declaracion de variables
       String asterisco;
       int alturaTriangulo, cantidadAsteriscos;
         
       
       //Asignacion de variables
       asterisco = "*";
       alturaTriangulo =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
       cantidadAsteriscos = 0;
        
       // Solucion de la actividad
       do {
            System.out.println(asterisco);
            asterisco = "*" + asterisco;
            cantidadAsteriscos++;
        } while (cantidadAsteriscos < alturaTriangulo);
        
    }
}
