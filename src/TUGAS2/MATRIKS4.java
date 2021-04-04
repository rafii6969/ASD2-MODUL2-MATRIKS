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
public class MATRIKS4 {
public static void main(String[] args){
        int[][] B = {
            {2,1,-5},
            {3,4,2}
        };
        int[][] Bt = new int[3][2];
        for(int i=0; i<B.length; i++){
            for(int j=0; j<B[0].length; j++){
                Bt[j][i] = B[i][j];
            }
        }
        for(int i=0; i<Bt.length; i++){
            for(int j=0; j<Bt[0].length; j++){
                System.out.print(Bt[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Rafi Dimas Ramadani");
    }
}
