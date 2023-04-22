/*
 6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio6P49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la persona: ");
        int cont = 0;
        int contP = 0;
        double peque = 0;
        double promedioTotal = 0;
        double sumaAltura = 0;
        double alto = 1;
        while (alto !=0) {
            alto = leer.nextDouble();
            cont ++;
            sumaAltura = sumaAltura + alto;
            if (alto <1.60) {
                peque = peque + alto;
                contP ++;
        }
        
        promedioTotal = sumaAltura / cont;
        
        System.out.println("El promedio de altura de las "  + cont + "personas cargadas es: " + promedioTotal );
        System.out.println("Y el promedio de alturas de personas que miden menos de 1.60 es: " + (peque / contP));
    }
    }
}
