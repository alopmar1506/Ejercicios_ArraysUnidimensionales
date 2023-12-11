import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
 * posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
 * hasta que el usuario elija la opción ‘c’ que terminará el programa.
 */

public class Ejer5 {
    public static void main(String[] args) {
        int array[];
        array = new int[5];
        int valor = 0;
        boolean datoValid = false;
        int pos = 0;
        String opc = "";
        Scanner sc = new Scanner(System.in);

            do{
                System.out.println("Introduce la opción que quiera realizar siendo a para mostrar los valores del array, b para introducir valores al array y c para salir del programa.");
                opc = sc.nextLine();

                switch (opc) {
                    case "a":
                        System.out.println("El array formado es ");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                        break;

                    case "b":
                        for (int i = 0; i < array.length; i++) {
                            do {
                                try {
                                    System.out.println("Introduce el valor que quieres introducir en el array");
                                    valor = sc.nextInt();

                                    System.out.println("Introduce la posición en la que quieres introducir en el valor");
                                    i = sc.nextInt();
                                    datoValid = true;
                                } catch (InputMismatchException ime) {
                                    System.out.println("El valor introducido no es correcto");
                                }
                                sc.nextLine();
                            } while (!datoValid);
                            array[i]=valor;
                        }

                        System.out.println("El array formado es ");

                        for (int i = 0; i < array.length; i++) {
                            System.out.println(array[i]);
                        }
                        break;

                    case "c":
                            System.out.println("Muchas gracias por usar el programa, hasta la próxima.");
                        break;
                }
            }while(!opc.equals("c"));
        

    }
}