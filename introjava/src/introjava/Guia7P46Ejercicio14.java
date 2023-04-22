/*
 14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void). 
El cambio de divisas es: 
    * 0.86 libras es un 1 € 
    * 1.28611 $ es un 1 € 
    * 129.852 yenes es un 1 € 
 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P46Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" C O N V E R T I D O R   D E   M O N E D A S ");
        System.out.println();
        System.out.println("Ingresa el tipo de moneda a converitr (número)");
        System.out.println();
        System.out.println(" 1 - Dólares ");
        System.out.println(" 2 - Yenes");
        System.out.println(" 3 - Libras");
        System.out.println();
        int numC = leer.nextInt();
        String moneda = null;
        switch (numC) {
            case 1:
                moneda = "Dólares" ;
                break;
            case 2:
                moneda = "Yenes" ;
                break;
            case 3:   
                moneda = "Libras";
        }
        
        System.out.println();
        System.out.println("Ingresa la cantidad de euros que deseas convertir");
        System.out.println();
        int euros = leer.nextInt();
        
        convertidor(moneda,euros);
                
    }
    
    public static void convertidor (String moneda,int euros) {
        
        double coin;
        switch (moneda) {
            
            case "Dólares":
                coin = (euros * 1.28611);
                System.out.println();
                System.out.println(euros + " euros equivalen a " + coin + " dólares");
                break;
            case "Yenes" :
                coin = (euros * 129.852);
                System.out.println();
                System.out.println(euros + " euros equivalen a " + coin + " yenes");
                break;
            case "Libras":
                coin = (euros * 0.86);
                System.out.println();
                System.out.println(euros + " euros equivalen a " + coin + " libras");
        }
               
    }
}