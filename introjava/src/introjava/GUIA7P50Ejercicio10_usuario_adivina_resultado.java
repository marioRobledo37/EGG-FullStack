/*
 10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. 
 */
package introjava;

import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * @author Usuario
 */
public class GUIA7P50Ejercicio10_usuario_adivina_resultado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int cont1 = 0;
        int resultado = 200;
        Scanner leer = new Scanner(System.in);
        System.out.println("Tienes que adivinar el resultado de esta multiplicacion");
        System.out.println("Ahora puedes empezar a adivinar");
        
        num1 = (int) (Math.random() * 10 + 1); 
        num2 = (int) (Math.random() * 10 + 1);   
        do {
            System.out.println("Dime el resultado que piensas");
            resultado = leer.nextInt();
            cont1 ++;
            if (resultado == (num1*num2)) {
                System.out.println("Le has pegado! en "+cont1+ " intentos");
                System.out.println("el resultado de: "+num1+" x "+num2+" es: "+resultado);
            }else if (resultado < (num1*num2)){
                System.out.println("Prueba con un numero mayor");
            }else{
                System.out.println("Prueba con un numero menor");
            }   
            } while (resultado != (num1*num2));
    
        
        
    }
    
}