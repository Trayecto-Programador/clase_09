/**
 * Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla
 * 8 - 16 - 24, etc
 */
package actividad03;

public class Actividad03 {

    public static void main(String[] args) {
        int SerieHasta, multiplo, valor;
        valor = 0;
        SerieHasta = 500;
        multiplo = 8;

        do {
            if (valor != 0) {
                if (valor % 8 == 0) {
                    System.out.println(valor);
                    valor++;
                }
            }
            valor++;
        } while (valor <= SerieHasta);

    }

}
