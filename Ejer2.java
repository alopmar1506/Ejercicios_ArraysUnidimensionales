
/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito:programa que cree un array de enteros de tamaño 100 y lo rellene con valores
 * enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
 * mostrará en qué posiciones del array aparece N.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        int valor = 0;
        int array[];
        int posicion = 0;
        boolean datoValid = false;
        array = new int[100];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
            System.out.println(array[i]);
        }

        do {
            try {
                System.out.println("Introduce un valor para ver en que posición del array se encuentra");
                valor = sc.nextInt();
                datoValid = true;
            } catch (InputMismatchException ime) {
                System.out.println("El valor introducido no es correcto");
            }
            sc.nextLine();
        } while (!datoValid);
        
        System.out.println("La posición del valor " + valor + " en el array es ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                System.out.print( i + " ");
            }
        }

    }
}
