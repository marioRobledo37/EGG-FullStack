/*
 18. Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA7P51Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
        int [] vec = new int [5] ;
        int suma = 0;
        int num;
       
        Scanner leer = new Scanner(System.in);
    
        
          for (int i = 0; i <vec.length; i++) {
                  System.out.println("Ingrese los valores del vector");
                   num =  leer.nextInt();
                   vec[i]= num;
                   suma += vec[i];
                 
            }
  
          
          System.out.println("El resultado de la suma1 es: " + suma);
        
                
                
    
    }
}