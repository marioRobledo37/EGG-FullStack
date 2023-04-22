/*
 7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java. 
 */
package introjava;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Guia7P44Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese una palabra o frase: ");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        }else{
        System.out.println("Incorrecto");
    }
    
    }
    
}
