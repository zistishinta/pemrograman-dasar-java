package demo3_perulangan;

import java.util.Scanner;

public class D_bintangTriangular {


    public static void main(String[] args) {
        int tinggi;
        Scanner in = new Scanner(System.in);
        System.out.println("Tinggi");
        tinggi = in.nextInt();
        
        for (int i=1; i<=tinggi; i++) {
            for (int s=tinggi-i; s>0; s--) {
                System.out.print(" ");
            }
            for (int x=1; x<=i; x++) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
       
    }
    
}
