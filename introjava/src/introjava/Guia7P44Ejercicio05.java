/*
 5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt(). 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P44Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        
       
        
        System.out.println("Ingresa un numero:");
        num1 = leer.nextInt();
       
        elDoble(num1);
        elTriple(num1);
        laRaiz(num1);
        
    }
    public static void elDoble(int num1){
        int doble = num1*2;
        System.out.println("El doble de " + num1 + " es: " + doble);
        }
    public static void elTriple(int num1){
        int triple = num1*3;
        System.out.println("El triple de " + num1 + " es: " + triple);
        }
    public static void laRaiz(int num1){
        int raiz = (int) Math.sqrt(num1);
        System.out.println("La raiz de " + num1 + " es: " + raiz);
        }
    public static void esPar(int num1){
        if(num1%2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        
    }
        
}

    