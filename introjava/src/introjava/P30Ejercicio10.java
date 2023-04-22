/*
EJERCICIO 10 
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e
imprima el número ingresado seguido de tantos asteriscos como indique
su valor. Por ejemplo: 
5 *****
3 ***
11 ***********
2 ** 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P30Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros ");
        
        for (int j = 0; j < 4; j++) {
            System.out.println("");
            int n = leer.nextInt();
            
            if (n<=20) {
                //System.out.print(n);
                for (int i = 0; i < n; i++) {
                    System.out.print("*");
            
                }
            }else {
                j--;
                System.out.println("El numero ingresado en invalido");

            }
            
        }
 
        
    }
}
 
