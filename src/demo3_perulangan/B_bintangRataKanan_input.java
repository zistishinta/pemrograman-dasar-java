package demo3_perulangan;

import java.util.Scanner;

public class B_bintangRataKanan_input {

public static void main(String[] args) {
        int input;
        
        Scanner data = new Scanner(System.in);  
        System.out.println("Masukkan tinggi bintang = ");
        input = data.nextInt();
        
        
        for (int a=1; a<=input; a++){
           for (int b=4; b>=a; b--) {
               System.out.print(' ');
           }
           for (int c=1; c<=a; c++){
               System.out.print('*');
           }
           System.out.println();
       }
    }

    
}
