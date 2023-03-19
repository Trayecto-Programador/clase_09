package actividad06;

import javax.swing.JOptionPane;

public class Actividad06 {

    public static void main(String[] args) {
//Declaracion de Variables
        int numero, opcion;

        

// Procesamiento de la solucion
        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entre 0 y 999"));

            if (numero >= 0 && numero < 10) {
                System.out.println("El valor ingresado contiene un digito");
            } else {
                if (numero >= 10 && numero < 100) {

                    System.out.println("El valor ingresado contiene dos digito");
                } else {
                    if (numero >= 100 && numero < 1000) {
                        System.out.println("El valor ingresado contiene tres digito");
                    } else {
                        System.out.println("Valor ingresado invalido");
                    }

                }
            }
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cero para salir o Ingrese otro numero para continuar"));
        } while (opcion != 0);
    }
}
