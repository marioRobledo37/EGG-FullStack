/*
 11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú: 
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción: 
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú. 
 */
package introjava;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P45Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[]asrg){
    Scanner sc =new Scanner(System.in);
    boolean cerrar=true;
   int menu;
   double num1;
   double num2;
   double num3;
   System.out.println("Ingrese primer numero");
   num1=sc.nextDouble();
   System.out.println("Ingrese segundo numero");
   num2=sc.nextDouble();
   
   
   while(cerrar==true){
        //System.out.println("Ingrese primer numero");
        //num1=sc.nextDouble();
        //System.out.println("Ingrese segundo numero");
        //num2=sc.nextDouble();
        
            System.out.println("Menu");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            menu=sc.nextInt();
            switch (menu){
                case 1:
                    num3=num1 + num2;
                    System.out.println("La suma de los numeros es ="+num3);
                    break;
                case 2:
                    num3=num1 - num2;
                    System.out.println("La Resta de los numeros es ="+num3);
                    break;
                case 3:
                    num3=num1 - num2;
                    System.out.println("La Resta de los numeros es ="+num3);
                    break;   
                case 4:
                    num3=num1 / num2;
                    System.out.println("La divicion de los numeros es ="+num3);
                    break;
                case 5:
                    String a;
                    System.out.println("Seguro que desea salir? (s/n)");
                    a=sc.next();
                    if("s".equals(a)){
                    cerrar=false;
                        System.out.println("bye bye");
                    }else{
                        System.out.println("Gracias por continuar");
                        System.out.println("__________________________");
                    }
                    
            }         
        
    }
    }
        
    }    

