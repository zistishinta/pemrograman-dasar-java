package demo3_perulangan;

import java.util.Scanner;

public class C_bintangKolom {

    public static void main(String[] args) {
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("Tinggi baris");
        input = in.nextInt();
        
        for (int a=1; a<=input; a++) {
            for (int b=1; b<=input; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
