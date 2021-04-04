/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;

/**
 *
 * @author rafii
 */
public class MATRIKS2 {
public static void main(String[] args){
        int[][] a= {
            {40,50},
            {60,70},
            {80,90}
        };
        int[][] b= {
            {6,7},
            {8,9},
            {10,11}
        };
        if((a.length == b.length) && (a[0].length == b[0].length)){
            int[][] c = new int[a.length][a[0].length];
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[0].length; j++){
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
            for (int[] c1 : c) {
                for (int j = 0; j<c[0].length; j++) {
                    System.out.print(c1[j] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("Rafi Dimas Ramadani");
       }
}

