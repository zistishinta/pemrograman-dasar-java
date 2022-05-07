package demo3_perulangan;

import java.util.Scanner;

public class H_bintangTrapesium {
    
    public static void main(String[] args) {
        int n,p,q,r,z;
        
        System.out.println("Masukkan baris =");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (p=1; p<=10; p++) {
            if (p<=4){
                continue;
            } 
            for (q=10; q>=p; q--) {
                System.out.print(" ");
            }
            for (r=1; r<=p; r++) {
                System.out.print("*");
            }
            for (z=1; z<=p; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
//    System.out.println("Masukkan baris : ");
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//       
//        for(int b=1; b<=a; b++) {
//            for(int c=a; c>b; c--) {
//                System.out.print(" ");
//            }
//            for(int d=1; d<=b; d++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//            }
//            System.out.println();
//            System.out.print("baris = " + a);
    }
}