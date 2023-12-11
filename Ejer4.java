import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ana Xiang
 *         Fecha:
 *         Propósito: programa que cree dos arrays de enteros de tamaño 100.
 *         Luego introducirá en el
 *         primer array todos los valores del 1 al 100. Por último, deberá
 *         copiar todos los valores del
 *         primer array al segundo array en orden inverso, y mostrar ambos por
 *         pantalla.
 */

public class Ejer4 {
    public static void main(String[] args) {
        int array1[];
        array1 = new int[100];
        int array2[];
        array2 = new int[100];
        int valor = 0;
        boolean datoValid = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            array1[i]=(int)(1+Math.random()*100);
        }

        System.out.println("El primer array es ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        System.out.println("El array 2 copiado del array 1 de forma inversa es ");

        for (int i = 99; i > -1; i--) {
            array2[i] = array1[i];
            System.out.print(array2[i] +" ");
        }

    }
}
