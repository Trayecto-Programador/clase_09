/**
 * En un banco se procesan datos de las cuentas corrientes de sus clientes.
 * De cada cuenta corriente se conoce: número de cuenta y saldo actual.
 * El ingreso de datos debe finalizar al ingresar un valor negativo
 * en el número de cuenta.
 * Se pide realizar un programa que lea los datos de las cuentas corrientes
 * e informe:
 * a) De cada cuenta: número de cuenta y estado de la cuenta según su saldo,
 * sabiendo que: Estado de la cuenta 'Acreedor' si el saldo es >0.
 * 'Deudor' si el saldo es <0. 'Nulo' si el saldo es =0. b) La suma total de los saldos acreedores.
 */
package actividad07;

import javax.swing.JOptionPane;

public class Actividad07 {

    public static void main(String[] args) {
        int numerosCuenta, saldoActual;
        String mensaje1, mensaje2, mensaje3;
        
        numerosCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta"));
        saldoActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo de su cuenta"));
        mensaje1 = "Acreedor";
        mensaje2 = "Deudor";
        mensaje3 = "Nulo";
        do {
            if (saldoActual > 0) {
                System.out.println("Informe");
                System.out.println("Numero de cuenta: "+ numerosCuenta);
                System.out.println("Saldo de la cuenta: "+ saldoActual);
                System.out.println("Estado de la cuenta: "+ mensaje1);
            } else {
                if(saldoActual < 0){
                    System.out.println("Informe");
                System.out.println("Numero de cuenta: "+ numerosCuenta);
                System.out.println("Saldo de la cuenta: "+ saldoActual);
                System.out.println("Estado de la cuenta: "+ mensaje2);
                }else{
                    System.out.println("Informe");
                System.out.println("Numero de cuenta: "+ numerosCuenta);
                System.out.println("Saldo de la cuenta: "+ saldoActual);
                System.out.println("Estado de la cuenta: "+ mensaje3);
                }
            }
            numerosCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta - Si ingresa un nuero negativo el programa finalizará"));
            if(numerosCuenta >0){
           saldoActual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo de su cuenta"));
            }
        } while (numerosCuenta >= 0);
        
    }

}
