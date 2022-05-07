package demo6_array;

import javax.swing.*;

public class matriksMultidimensi {

    public static void main(String[] args) {
        int A [][] = new int [3][3];
        int B [][] = new int [3][3];
        int C[][]=new int [3][3];
        String mA [][] = new String [3][3];
        String mB [][] = new String[3][3];
        String mC [][] = new String [3][3];
        int i,j,k,m;
        i=0;
        j=0;
        
        // MATRIKS A
        do{ j=0; do{
            mA[i][j] = JOptionPane.showInputDialog("Masukan mA [" + i + "]["+ j + "]" );
            A[i][j]= Integer.parseInt(mA[i][j]);
            j++;
        } while (j<3); i++; }while(i<3); 
        
        /* MATRIKS B
        k=0;
        do{
            m=0;
        do{mB[k][m]= JOptionPane.showInputDialog("Masukan mB [" + k + "]["+ m + "]" );
        B[k][m]= Integer.parseInt(mB[k][m]);
        m++;
        } while (m<3);
        do j k++;
        }while(k<3);   // end do i
    }   */
    
    
}}
