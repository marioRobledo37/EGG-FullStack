/*
 23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.  
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().  
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA7P52Ejercicio23_sopa_de_letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        String[] palabras = new String[5];
        System.out.println("\\\\\\\\\\\\  El programa hara una sopa de letras  //////");
        System.out.println("Para empezar, ingresa '5' palabras de 3 a 5 caracteres");
        
        for(int i=0;i<5;i++) {
            do {
                System.out.println("Ingresa la " + (i+1) + " Palabra");
                palabra = leer.nextLine();
                palabras [i] = palabra;
                System.out.println(palabras [i]);
                
            } while (palabra.length() <3 || palabra.length() >5);
            
        }
            
        //generaLetrasAleatoria(20);
        //filasAleatorias(N);    
        ubicaPalabra(palabras, 20);
        //generaLetrasAleatoria(20);
    }

        
   
    
    public static int filasAleatorias(int N){
        int fila = (int)(Math.random()*(N-1)+1);
        //System.out.println("FILA: " + fila);
        return fila;
    }
    
    public static void generaLetrasAleatoria(int N){// Rellena los celdas con letras
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                int letra = (int)(Math.random()*25+65);
                System.out.print((char)letra+ " ");
            }
            System.out.println();
        }   
    }
    
    public static void ubicaPalabra(String palabras[], int N){
        for(int i=(filasAleatorias(20));i<N;i++) {
            for(int j=(filasAleatorias(15));j<N;j++) {
                //    ACA VA LA CARGA LETRA A LETRA DE LA PALABRA
                
                
                
            }
        }
    }
    
}
