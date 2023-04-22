/*
 14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA7P50Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media = 0;
        int familia = 0;
        int sumaEdad = 0;
        int cont = 0;
        int [][]m=new int[familia][20];
        System.out.println("Ingrese la cantidad de la familia");
        familia = sc.nextInt();
        for (int x=0;x<familia;x++){
            for(int w=0;w<20;w++){
                System.out.println("Ingrese edades de hijos de familia Nº"+(x+1));
                System.out.println("");
                int edad=sc.nextInt();
                cont ++;
                if (edad == 0) {
                    w = 20;
                    break;
                }
                sumaEdad = sumaEdad + edad;
            } 
            media = sumaEdad / (cont-1);
            System.out.println("La media de las edades de los hijos de la familia " + (x+1)+ " es: " + media);
            cont = 0;
            sumaEdad = 0;
        }
    }
}