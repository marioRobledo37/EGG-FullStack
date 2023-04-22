/*
 EJERCICIO 12 
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son. 
 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P34Ejemplo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
       
        
        System.out.println("Ingresa dos numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        esMultiplo(num1, num2);  
    }
    public static void esMultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println("Es multiplo");
        
        }else{
            System.out.println("NO ES MULTIPLO");
        }
}


}