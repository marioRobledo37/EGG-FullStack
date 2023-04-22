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
public class matrizRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] m = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                    };
        
        recorrerMatrizRecursivo(m, 0, 0);
    }
    public static void recorrerMatrizRecursivo(int[][] m, int i, int j){
        System.out.print(m[i][j]+" ");
        if (i!=m.length-1 || j!=m.length-1) {//SSI 0 distinto
            //System.out.println(i);
            if (j==m[i].length-1) {
                i++;
                j=0;
                System.out.println("");
            }else{
                j++;
            }
            recorrerMatrizRecursivo(m, i, j);
        }
    
    }
    
}
