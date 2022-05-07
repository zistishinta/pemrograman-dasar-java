package demo3_perulangan;

import java.util.Scanner;

public class I_bintangSimetris {

    public static void main(String[] args) {
        int a,ax,b;
        double c = 0;
        System.out.println("Masukkan baris =");
        Scanner input = new Scanner(System.in);
        ax = input.nextInt();
     //   c = (int) ((ax / 2) + 1);
        for (a=1; a<=ax; a++) {
            for (b=1; b<=ax; b++) {
                if (b!=ax && a!=c) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

    }
}
