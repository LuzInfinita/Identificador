/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadordecaracteres;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author JAGZ
 */
public class BuscadorDeCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Los usuarios escriben cualquier cosa y es guardada como una cadena
        Scanner palabra = new Scanner(System.in);
        String Palabra = palabra.nextLine();

        //La cadena es convertida en un arreglo con ".split", el espacio vacio es para que imprima caracter por caracter  
        String conversionPalabra[] = Palabra.split("");

        for (int i = 0; i < conversionPalabra.length; i++) {
            System.out.println(conversionPalabra[i]);

        }
    }
}
