package introjava;

/**
 * 
 * @author Usuario
 */

public class matrizBuscaValor {

    public static void main(String[] args) {
        
        int[][] numeros = {
            {3, 11, 13},
            {2, 5, 17},
            {23, 29, 17},
            {7, 2, 31},
        };
        int[][] numerosPeque = {
            
            {29, 17},
            {2, 31},
        };
        
        //int numeroPeque [][] = 29;
        
        System.out.println(buscarValor(numeros, numerosPeque));
    }
    // buscar valor boolean
    public static boolean buscarValor(int [][] matriz, int [][] numerosPeque){
        int x=0;
        int y=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numerosPeque [x][y]) {
                    System.out.println("posicion" + i + ", " + j);
                    if ((matriz.length-i) <= numerosPeque.length) {
                        for (int x = 0; x < numerosPeque.length; x++) {
                            for (int y = 0; y < numerosPeque[x].length; y++) {
                        
                    }
                    return true;
                }
                
            }
            
        }
        return false;
    }
}