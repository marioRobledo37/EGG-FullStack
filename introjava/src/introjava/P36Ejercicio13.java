/*
EJERCICIO 13 
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.  
 EJERCICIO 14 
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class P36Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos integrantes son?");
        int val = leer.nextInt();
        String[] Equipo = new String[val];
    
        for (int i = 0 ; i<val ; i++) {
            System.out.println("Ingresa valor en la posicion "+ (1+i));
            Equipo[i] = leer.next();
        }
        for (int i = 0 ; i<val ; i++) {
            System.out.println(" "+ Equipo[i] +" ");
        }
        System.out.println(" ");
    }
}
