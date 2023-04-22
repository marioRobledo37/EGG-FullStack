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
public class sopadeletras {


    public static void main(String[] args) {
        sopa s = new sopa();
        s.genera(10);
    }

}
class sopa {
    String[] animal;
    //String [] caracter = new String[50];

public sopa() {
    animal = new String [] {"FOCA","TIBURON","CONEJO","RATON","GATO","PERRO","PERICO","RANA",
        "SAPO","ARDILLA","CUYO","SERPIENTE","GORILA","BALLENA","LEON","TIGRE","CABALLO",
        "BURRO","OSO","ELEFANTE"};
}
public void genera(int N){
for(int i=0;i<N;i++) {
    for(int j=0;j<N;j++) {
        int letra = (int)(Math.random()*26+65);
        System.out.print((char)letra+ " ");

}
    System.out.println();
}


}
}