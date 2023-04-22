/*
 12. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.  
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.  
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals(). 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P45Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       int c,in,s;
       c=in=0;
       s=0;
        String frase,FDE;
        FDE="&&&&&";
        do {
        System.out.println("Ingrese una frase que comienze con X, termine con O y tenga 5 caracteres en total; para salir ingrese &*5");
        frase=leer.nextLine();
        if (frase.length()==5) {
            if (frase.substring(0,1).equals("X")) {
                if (frase.substring(frase.length()-1).equals("O")) {
                    c+=1;
                }else{
                    in+=1;
                }
            } else {
                in+=1;
            }
        } else{
            in+=1;
        }
            if (frase.equals(FDE)) {
                s=1;
                in-=1;
            }
        } while (s==0);
        System.out.println("el número de frases ingresadas que son correctas es igual a: "+c);
        System.out.println("el número de frases ingresadas que son incorrectas es igual a: "+in);
    }
    }
    
    
