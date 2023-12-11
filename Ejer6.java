import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa que permita al usuario almacenar una secuencia aritmética en un array y
 * luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
 * valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
 * 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al usuario V, I además de N (nº de valores a crear).
 */

public class Ejer6 {
    public static void main(String[] args) {
        int v = 0;
        int w = 0;
        int tam = 0;
        boolean datoValid = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Introduce un valor incial V para realizar una secuencia aritmética en el array");
                v = sc.nextInt();

                System.out.println("Introduce un valor para W para incrementar esa secuencia");
                w = sc.nextInt();

                System.out.println("Introduce un tamaño para el array");
                tam = sc.nextInt();
                datoValid = true;
            } catch (InputMismatchException ime) {
                System.out.println("El valor introducido no es correcto");
            }
            sc.nextLine();
        } while (!datoValid);

        int array[];
        array = new int[tam];

        System.out.println("El array formado con v+w de tamaño " + tam + " es");
        for (int i = 0; i < array.length; i++) {
            array[i] = v + i * w;
            System.out.println(array[i]);
        }
    }
}
