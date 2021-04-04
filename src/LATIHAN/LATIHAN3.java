
package LATHI2;

import static java.awt.PageAttributes.MediaType.C;

public class MATRIX_3 {
    public static void main (String[] args) {
    int [][] A = {
        {3, 7, 1},
        {2, 4, 6},
        {5, 8, 9}
    };
    
    int [][] B ={
        {6, 2, 4},
        {3, 5, 1},
        {8, 7, 9}
    };
    
    if ((A.length == B.length) && (A[0].length == B[0].length)){
        int[][] C = new int[A.length][A[0].length];
        for (int i=0; i<A.length; i++)
            for(int j=0; j<A[0].length; j++){
                C[i][j] = A[i][j] + B[i][j] ;
            }
        }
        int[] c = null;
            
               for(int q: c) {
                 System.out.print(q+" ");
              }
              System.out.println();
            }
            System.out.println(C[1][2]);
        }
        else static {
            System.out.println("Ukuran matrix tidak sama");
       }    
    }