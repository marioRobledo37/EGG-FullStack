/*
 EJERCICIO 6 
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * 
 */
public class P22Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = leer.nextInt();
        System.out.println("Ingrese un numero");
        int n2 = leer.nextInt();
        
        if(n1>25 && n2>25){
            System.out.println("Ambos son mayores a 25");}
            else if(n1>25){
            System.out.println(n1 + " Es mayor que 25");
        }else if(n2>25){
            System.out.println(n2 + " Es mayor que 25");
        }
        else{
            System.out.println("Ninguno es mayor a 25");
        }
    }
    
}