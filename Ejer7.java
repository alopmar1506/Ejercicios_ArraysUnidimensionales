import java.util.Scanner;

/**
 * @author Ana Xiang
 * Fecha:05/12/23
 * Propósito: programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
 */

public class Ejer7 {
    public static void main(String[] args) {
        int indice=0;
        int array[]=new int[10];
        Scanner sc=new Scanner(System.in);
        
        for(int i=1; i<array.length; i++){
            for(int j=1; j<=i; j++){
                if(indice<array.length){
                    array[indice]=i; 
                    indice++;
                }
            }
        }

        System.out.println("El array formado es ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
    }
}
