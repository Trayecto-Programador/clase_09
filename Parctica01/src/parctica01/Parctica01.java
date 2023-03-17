/**
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
 * realizar un programa que lea los sueldos que cobra cada empleado e informe
 * cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
 * Además el programa deberá informar el importe que gasta la empresa
 * en sueldos al personal.
 */
package parctica01;

import javax.swing.JOptionPane;

public class Parctica01 {

    public static void main(String[] args) {
        int sueldos, cantidadSueldo, cantidadSueldosRango1, cantidadSueldosRango2, cantidadEmpleados, totalesSueldos;

        cantidadEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
        cantidadSueldo = 0;
        cantidadSueldosRango1 = 0;
        cantidadSueldosRango2 = 0;
        totalesSueldos = 0;

        do {
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un sueldo comprendido entre 100 y 500"));


                if (sueldos >= 100 && sueldos <= 300) {
                    cantidadSueldosRango1++;
                    cantidadSueldo++;
                    totalesSueldos += sueldos;
                } else {
                    if (sueldos > 300 && sueldos <= 500) {
                        cantidadSueldosRango2++;
                        cantidadSueldo++;
                        totalesSueldos += sueldos;
                    } else{
                        System.out.println("Sueldo Ingresado fuera de rango, vuelva intentarlo...");
                    }

                }
            
        } while (cantidadSueldo < cantidadEmpleados);

        System.out.println("Informe");
        System.out.println("Empleados con sueldo en el rango de 100 a 300: " + cantidadSueldosRango1 + " empleados");
        System.out.println("Empleados con sueldo mayores a 300 hasta 500: " + cantidadSueldosRango2 + " empleados");
        System.out.println("Totales de Sueldos: " + totalesSueldos);

    }

}
