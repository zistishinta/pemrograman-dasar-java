package demo3_perulangan;

import java.util.Scanner;

public class F_bintangSamaSisi{

    public static void main (String[] args) {
        System.out.println("Masukkan baris : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
       
        for(int b=1; b<=a; b++) {
            for(int c=a; c>b; c--) {
                System.out.print(" ");
            }
            for(int d=1; d<=b; d++) {
                System.out.print("* ");
            }
            System.out.println();
            }
            System.out.println();
            System.out.print("baris = " + a);
            }
       }
