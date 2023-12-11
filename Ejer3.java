import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha: 05/12/23
 * Propósito: programa para realizar cálculos relacionados con la altura (en metros) de personas.
 * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
 * mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media.
 */

public class Ejer3 {
    public static void main(String[] args) {
        double altura = 0;
        int tam=0;
        double arrayAlturas[];
        double media = 0;
        double suma = 0;
        double max = 0;
        double min = 0;
        int personasEncimaMedia=0;
        int personasDebajoMedia=0;
        boolean datoValid=false;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de personas que va a introducir");
        tam=sc.nextInt();

        arrayAlturas = new double [tam];

        for (int i = 0; i < arrayAlturas.length; i++) {
            do {
                try {
                    System.out.println("Introduce la altura en metros");
                    altura = sc.nextDouble();
                    datoValid = true;
                } catch (InputMismatchException ime) {
                    System.out.println("El valor introducido no es correcto");
                }
                sc.nextLine();
            } while (!datoValid);
            
            arrayAlturas[i] = altura;
        }

        System.out.println("El array con las alturas guardas es ");
        for (int i = 0; i < arrayAlturas.length; i++) {
            System.out.println(arrayAlturas[i]);
        }

        for (int i = 0; i < arrayAlturas.length; i++) {
            suma += arrayAlturas[i];
        }
        System.out.println("La suma es " + suma);
        media = suma / tam;
        System.out.println("La media de las alturas introducidas es " + media);

        min = arrayAlturas[0];
        max = arrayAlturas[0];
        for (int i = 0; i < arrayAlturas.length; i++) {
            if (arrayAlturas[i] < min) {
                min = arrayAlturas[i];
            } else if (arrayAlturas[i] > max) {
                max = arrayAlturas[i];
            }
        }

        System.out.println("La altura máxima es " + max);
        System.out.println("La altura mínima es " + min);

        for(int i=0; i<arrayAlturas.length; i++){
            if(arrayAlturas[i]>media){
                personasEncimaMedia++;
            }else if(arrayAlturas[i]<media){
                personasDebajoMedia++;
            }
        }

        System.out.println("El número de personas por encima de la media es "+personasEncimaMedia);
        System.out.println("El número de personas por debajo de la media es "+personasDebajoMedia);

    }
}
