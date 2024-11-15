/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package org.example;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.Arrays;

public class Main_Kaprekar {

public static void main(String[] args){

}
    public static int kaprekarOp(int num) {

        String numStr = String.valueOf(num);

        while (numStr.length() < 4) {
            numStr = "0" + numStr;
        }

        char[] digits = numStr.toCharArray();
        Arrays.sort(digits);
        StringBuilder sortedNumDesc = new StringBuilder(new String(digits)).reverse();
        int numDesc = Integer.parseInt(sortedNumDesc.toString());

        StringBuilder sortedNumAsc = new StringBuilder(new String(digits));
        int numAsc = Integer.parseInt(sortedNumAsc.toString());

        return numDesc - numAsc;

    }

    public static int itKaprekar(int num) {
        int constant = 6174;
        int result = num;
        int cont= 0;
        while (result != constant){
            result = kaprekarOp(result);
            cont ++;
        }
        return cont;
    }



//aquí van sus funciones:

}
