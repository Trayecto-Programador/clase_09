/**
 * Realizar un programa que imprima 25 términos de la serie 
 * 11 - 22 - 33 - 44, etc. (No se
ingresan valores por teclado)

 */
package actividad02;


public class Actividad02 {

   
    public static void main(String[] args) {
        int repeticion, incremento, valorInicial, valorIncrementado, contadorIncremento;
       repeticion = 25;
       incremento =11;
       valorIncrementado = 0;
       contadorIncremento = 0;
       
       
        do {
            valorIncrementado = valorIncrementado + incremento;
            System.out.println(valorIncrementado);
            contadorIncremento++;
        } while (contadorIncremento < repeticion);
        
    }
    
}
