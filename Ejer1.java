import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R.
 * Por último, mostrará cuántos valores del array son igual o superiores a R.
 */

public class Ejer1 {
    public static void main(String[] args) {
        double array[];
        int superiores = 0;
        int iguales = 0;
        boolean datoValid = false;
        array = new double[100];
        double valor = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("El array de números aleatorios es:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (double) (1.0 + Math.random() * 10.0);
            System.out.print(array[i] + " ");
        }

        System.out.println();
        do {
            try {
                System.out.println("Introduce un valor entre 1 y 100");
                valor = sc.nextDouble();
                datoValid = true;
            } catch (InputMismatchException ime) {
                System.out.println("El valor introducido no es correcto");
            }
            sc.nextLine();
        } while (!datoValid);

        for (int i = 0; i < 5; i++) {
            if (valor < array[i]) {
                superiores++;
            } else if (valor == array[i]) {
                iguales++;
            }
        }

        System.out.println(superiores + " son los números que hay superirores a " + valor);
        System.out.println(iguales + " son los números que hay iguales a " + valor);

    }
}
