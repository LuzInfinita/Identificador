
package buscadordecaracteres;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author JAGZ
 */

public class BuscadorDeCaracteres {

    public static void main(String[] args) {

        //Los usuarios escriben cualquier cosa y es guardada como una cadena
        Scanner palabra = new Scanner(System.in);
        String Palabra = palabra.nextLine();

        //Necesitamos convertir nuestra cadena a un arreglo que contenga caracteres ordenados individualmente
        //En otras palabras, desmenuzar nuestra cadena caracter por caracter
        char conversionCadena[] = Palabra.toCharArray();

        //Ahora crearemos arreglos
        //"char" indicara el tipo de arreglo que usaremos, y con "[]" decimos que es un arreglo.
        char abecedarioMayusculas[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char abecedarioMinusculas[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //Los dos arreglos de "abecedario" nos serviran para identificar los caracteres que contenga la cadena hecha por el usuario.

        //Las variables int nos ayudaran a saber la cantidad del tipo de caracter
        //Estas nos serviran como contadores para lo que sigue.
        int con = 0;
        int con2 = 0;
        
        //El "for" se encargara de contar todas las letras minusculas mientras que recorre la longitud
        //de la cadena hecha por el usuario.
        for (int i = 0; i < conversionCadena.length; i++) {

            //Aqui recorremos el arreglo abecedarioMinusculas para comparar
            //sus caracteres y ver si es igual a alguno de los caracteres que escribio el usuario
            for (int j = 0; j < abecedarioMinusculas.length; j++) {
                if (conversionCadena[i] == abecedarioMinusculas[j]) { //Si el caracter en la posicion "i" es igual al caracter del abecedarioMinusculas, entonces hara lo de abajo.
                    con++;  //Al contador le sumamos 1
                }

            }

        }
        
        //Este "for" es igual al anterior pero ahora lo haremos con mayusculas 
        for (int i = 0; i < conversionCadena.length; i++) {
            
            for (int j = 0; j < abecedarioMayusculas.length; j++) {
                    if (conversionCadena[i] == abecedarioMayusculas[j]) {
                         con2++;
                    }
                }
        }
        //Por ultimo imprimimos los contadores cuyos valores cambiaron durante los ciclos.
        System.out.println("La palabra contiene: " + con2 + " letras mayusculas.");
        System.out.println("La palabra contiene: " + con + " letras minusculas.");
    }
}
