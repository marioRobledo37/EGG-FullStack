
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para verlo en numeros Romanos:");
        String romano[]= new String[10];
        int num = leer.nextInt();
        romano[0] = "I";
        romano[1] = "II";
        romano[2] = "III";
        romano[3] = "IV";
        romano[4] = "V";
        romano[5] = "VI";
        romano[6] = "VII";
        romano[7] = "VIII";
        romano[8] = "IX";
        romano[9] = "X";
        for (int i = 0; i < romano.length; i++) {
            i = num-1;
            String string = romano[i];
            System.out.println("el numero " +num+ " es " + romano[(i)]);
        break;    
        }
        
        //System.out.println("" + romano[(num-1)];
        
    
        
    }
    
}
