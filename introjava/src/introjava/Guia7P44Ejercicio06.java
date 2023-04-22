/*
 6. Crear un programa que dado un numero determine si es par o impar. 
 */
package introjava;

//import static introjava.Guia7P44Ejercicio5.esPar;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P44Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = leer.nextInt();
        
        esPar(numero);//aca invoque a un procedimiento que esta en el ejercicio anterior
       //QUE LUEGO LO COPIE ACA ABAJO Y COMENTE LA LINEA 8
    }
    public static void esPar(int num1){
        if(num1%2 == 0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
}
}