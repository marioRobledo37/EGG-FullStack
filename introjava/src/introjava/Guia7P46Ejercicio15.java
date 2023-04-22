/*
 15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. 
 */
package introjava;

/**
 *
 * @author Usuario
 */
public class Guia7P46Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        
        int[] vector = new int[100];
        
        
        for (i = 0; i<100; i++) {
            
            vector[i] = (int) (Math.random() * 10);
            
        }
           
        for(i=vector.length-1; i>=0; i--){
            System.out.println(vector[i]);
        }
    }
}

