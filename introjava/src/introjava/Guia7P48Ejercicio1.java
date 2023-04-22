/*
 1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P48Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);  
        int horas, dias, num, minutos;
        
        System.out.print("04. MOSTRAR LA CANTIDAD DE HORAS Y MINUTOS.\n\n");    
        System.out.print("Ingrese una cantidad en minutos : ");
        num = ingreso.nextInt();
        dias = num/1440;
        horas = (num-(dias*1440))/60;
        minutos = (num-(dias*1440)-(horas*60));
        System.out.println(dias + " Dias");
        System.out.println(horas + " Horas");
        System.out.println(minutos + " minutos"); 
    }   
}
        /*System.out.print("04. MOSTRAR LA CANTIDAD DE HORAS Y MINUTOS.\n\n");    
        System.out.print("Ingrese una cantidad en minutos : ");
        num = ingreso.nextInt();
        dias = num*60/86400;
        horas = (num*60-(dias*86400))/3600;
        minutos = (num*60-(dias*86400)-(horas*3600))/60;
        System.out.println(dias + " Dias");
        System.out.println(horas + " Horas");  */