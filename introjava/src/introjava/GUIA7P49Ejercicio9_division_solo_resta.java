/*
 9. Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.  
Por ejemplo: 50 / 13: 
50 – 13 = 37  una resta realizada  
37 – 13 = 24  dos restas realizadas 
24 – 13 = 11  tres restas realizadas  
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. 
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GUIA7P49Ejercicio9_division_solo_resta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int cont1 = 0;
        int divi = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero! como dividendo");
        num1 = leer.nextInt();
        divi = num1;
        System.out.println("Ingrese un numero entero! como divisor");
        num2 = leer.nextInt();
        while (num2 >= num1) {
            System.out.println("Ingrese otro numero entero! como divisor menor a: "+num1);
            num2 = leer.nextInt();
        }
        while (num1 >= num2) {
            num1 = num1 - num2;
        cont1 ++;
        }
        System.out.println("El resultado de: "+divi+" / "+num2+" es:");
        System.out.println("El cociente es: "+cont1);
        System.out.println("El residuo es: "+num1);
    }
    
}
