/**
 * Ingresar 10 libros con los siguientes datos: Título, Autor, Categoría y
 * Precio de venta.
 * Al finalizar mostrar el promedio de venta de los libros que pertenecen
 * a la categoría de Historia.
 */
package actividad05;

import javax.swing.JOptionPane;

public class Actividad05 {

    public static void main(String[] args) {
        int cantidadLibrosAIngresar, cantidadLibrosIngresados;
        //Declaracion de Variables
        String titulo, autor, categoria;
        double precioVenta, promedio, totalHistoria, cantidadHistoria;

        //Inicializacion de Variables Parte I
        totalHistoria = 0;
        cantidadHistoria = 0;
        cantidadLibrosIngresados = 0;
        cantidadLibrosAIngresar = 10;

        //Procesamiento de la solucion
        //Inicio de la estructura de cointro repetitiva
        do {
            // Inicializacion de las variables Parte II
            titulo = JOptionPane.showInputDialog("Ingrese el titulo del Libro");
            autor = JOptionPane.showInputDialog("Ingrese su Autor");
            categoria = JOptionPane.showInputDialog("Ingrese su Categoria");
            precioVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su precio de venta"));

            //Validacion de la categoria Historia
            if (categoria.equalsIgnoreCase("Historia")) {
                cantidadHistoria = cantidadHistoria + 1;// cuenta libro de historia
                totalHistoria = totalHistoria + precioVenta; // acumula el precio de venta
            }
            cantidadLibrosIngresados++;
        } while (cantidadLibrosIngresados < cantidadLibrosAIngresar);
        // fin de la estructira de contro repetitiva
        
        //calculo del Promedio finalizada la carga de datos
        promedio = totalHistoria / cantidadHistoria;

        // Imprime los datos solicitados por la consigna
        System.out.println("<---Informe--->");
        System.out.println("Cantidad de libro de historia ingresados: " + cantidadHistoria);
        System.out.println("Importe Total de libro de historia: $ " + totalHistoria);
        System.out.println("Promedio de ventas  de libro de historia: $" + promedio);
    }

}
