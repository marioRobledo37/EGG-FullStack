/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;


/**
 *
 * @author Usuario
 */
public class test {
    

    public static void main(String[] args, int c) {
        int c = 0;
        // Para rellenar y mostar la matriz con letras
        String [][]matriz=new String[20][20]; //declaramos la matriz
        for (int x=0; x < matriz.length; x++) {// se posiciona en la fila
            System.out.print("|"); //Imprime una barra al inicio de la fila
            for (int y=0; y < matriz[x].length; y++) {//Empieza a recorrer x columnas dentro de la fila
                String texto = "abcdefghijklmnñopqrstuvwxyz";
                if ("0".equals(matriz [x][y]))
                    c = numAleatorio.nextInt(27);
                    int d = c + 1;
                    matriz[x][y] = texto.substring(c,d);
                    System.out.print (matriz[x][y]);
                    if (y!=matriz[x].length-1) 
                        System.out.print(" ");
                }
            }
            System.out.println("|");
        }
    }