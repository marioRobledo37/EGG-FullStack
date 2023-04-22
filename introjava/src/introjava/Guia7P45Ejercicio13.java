/*
 13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente: 
* * * * 
*      * 
*      *
* * * * 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P45Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Pedimos al usuario que introduzca el tamaño del cuadrado
        System.out.print("Introduce el tamaño del cuadrado: ");
        n = scanner.nextInt();

        // Dibujamos el cuadrado
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}