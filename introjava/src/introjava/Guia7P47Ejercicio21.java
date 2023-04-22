/*
 21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P. 
Ejemplo: 

 
 
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los
índices:
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia7P47Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int [5][5];
        int [][] matrizP = new int [3][3];
        
        matriz [0][0] = 3;
        matriz [0][1] = 4;
        matriz [0][2] = 4;
        matriz [0][3] = 1;
        matriz [0][4] = 5;
        matriz [1][0] = 6;
        matriz [1][1] = 6;
        matriz [1][2] = 9;
        matriz [1][3] = 5;
        matriz [1][4] = 1;
        matriz [2][0] = 2;
        matriz [2][1] = 4;
        matriz [2][2] = 4;
        matriz [2][3] = 9;
        matriz [2][4] = 7;
        matriz [3][0] = 6;
        matriz [3][1] = 6;
        matriz [3][2] = 9;
        matriz [3][3] = 9;
        matriz [3][4] = 7;
        matriz [4][0] = 8;
        matriz [4][1] = 10;
        matriz [4][2] = 12;
        matriz [4][3] = 9;
        matriz [4][4] = 7;
       // Matriz pequeña 
        matrizP [0][0] = 2;
        matrizP [0][1] = 4;        
        matrizP [0][2] = 4;
        matrizP [1][0] = 6;
        matrizP [1][1] = 6;
        matrizP [1][2] = 9;
        matrizP [2][0] = 8;
        matrizP [2][1] = 10;
        matrizP [2][2] = 12;
        
        
        int i = 0;
        int j = 0;
        int m = 0;
        int n = 0;
        
        for (i=0; i<matriz.length; i++){
            for (j=0; j<matriz[0].length; j++){
                if (matrizP [0][0] == matriz [i][j]) {
                    m = i;
                    n = j;
                    if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ){
                        if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                            if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                    if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                        if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                            if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                                if (matrizP [0][0] == matriz [i][j] && (matriz.length - i) >= 2 ) {
                                                    System.out.println("Se encuentra coincidencia en: " + m + ", " + n );
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                    
                }else{
                    System.out.println("NO Se encuentra coincidencia");
                    
                }
               
            }
        }
        for (i=0; i<matriz.length; i++){
            for (j=0; j<matriz[0].length; j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        for (i=0; i<matrizP[0].length; i++){
            for (j=0; j<matrizP[0].length; j++){
                System.out.print("["+matrizP[i][j]+"]");
            }
            System.out.println("");
        }
       
    }
       
        
        
        
        
    
}
