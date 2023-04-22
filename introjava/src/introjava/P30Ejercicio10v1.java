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
public class P30Ejercicio10v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int i = 0;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 4 numeros ");
            int n = leer.nextInt();
            int n2 = leer.nextInt();
            int n3 = leer.nextInt();
            int n4 = leer.nextInt();

            if (n<=20) {
                 System.out.print(n);
                 for (int i = 0; i < n; i++) {
                    System.out.print("*");
                }
                    }else {
                System.out.print("El numero ingresado en invalido");


            } System.out.println(" ");
            if (n2<=20) {
                System.out.print(n2);
                for (int i = 0; i < n2; i++) {
                    System.out.print("*");
                }
                }else {
                System.out.print("El numero ingresado en invalido");

            }System.out.println(" ");
            if (n3<=20) {
                System.out.print(n3);
                for (int i = 0; i < n3; i++) {
                System.out.print("*");

            }
                }else {
                System.out.print("El numero ingresado en invalido");
                
            } System.out.println(" ");
            if (n4<=20) {
                System.out.print(n4);
                for (int i = 0; i < n4; i++) {
                    System.out.print("*");
                    
            }
            }else {
                System.out.print("El numero ingresado es invalido");

            }



            System.out.println(" ");
 
             // TODO code application logic here
        }
}
 
