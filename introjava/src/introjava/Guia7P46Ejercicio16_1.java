/*
 16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido 

Para generar numeros aleatorios:
    la formula es:
                int numero = (int)(Math.random()*(X-Y+1)+Y;

        Para numeros aleatorios entre 25 y 75
                int numero = (int)(Math.random()*(75-25+1)+25);
 */
package introjava;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Guia7P46Ejercicio16_1 {

    private static int[] vector;

    /**
     * @param args the command line arguments
     */
    public static void llenarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            int num2 = (int) (Math.random() * 10000);
            vector[i] = num2;
            System.out.print("[" + vector[i] + "] ");
        }
        int n;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        for (int i = 0; i < vector.length; i++) {
         
            switch (n = (int)(Math. log10(vector[i])+1)){
                case 1:
                    cont1=cont1+1;
                    break;
                case 2:
                    cont2=cont2+1;
                    break;
                case 3:
                    cont3=cont3+1;
                    break;
                case 4:
                    cont4=cont4+1;
                    break;
                case 5:
                    cont5=cont5+1;
                    break;
            }
        }
        System.out.println("");
        if (cont1 >0){
            System.out.println("HAY "+ cont1 +" de un solo digito");
        }
        if (cont2 >0){
           System.out.println("HAY "+ cont2 +" de dos  digito"); 
        }
        if (cont3 >0){
          System.out.println("HAY "+ cont3 +" de tres digito");  
        }
        if (cont4 >0){
           System.out.println("HAY "+ cont4 +" de cuatro digito"); 
        }
        if (cont5 >0){
          System.out.println("HAY "+ cont5 +" de cinco  digito");  
        }
    }
    
}