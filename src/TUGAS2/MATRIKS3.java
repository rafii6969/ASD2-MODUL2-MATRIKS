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
public class MATRIKS3 {
public static void main(String[] args){
        int[][] a = {
            {3,3,7},
            {2,8,1}
        };
        int[][] b = {
            {3,8},
            {4,2},
            {5,8}
        };
        int jumlah =0;
        
        if(a[0].length == b.length){
            int[][] c = new int[a.length][b[0].length];
            for(int i=0; i <a.length; i++){
                for(int j=0; j<b[0].length;j++){
                    for(int k=0; k<b.length;k++){
                        jumlah = jumlah + a[i][k] * b[k][j];
                    }
                    c[i][j] = jumlah;
                    jumlah =0;
                }
            }
            for (int[] c1 : c) {
                for (int j = 0; j < c[0].length; j++) {
                    System.out.print(c1[j] + "\t");
                }
                System.out.println();
            }
        }
        System.out.println("Rafi Dimas Ramadani");
    }
}


