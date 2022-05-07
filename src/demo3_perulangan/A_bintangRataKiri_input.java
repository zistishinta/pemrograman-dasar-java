package demo3_perulangan;

import java.util.Scanner;

public class A_bintangRataKiri_input {
  
    public static void main(String[] args) {
        int input;
        
        Scanner data = new Scanner(System.in);  
        System.out.println("Masukkan tinggi bintang = ");
        input = data.nextInt();
        
        for (int a=1; a<=input; a++) {
            for (int b=1; b<=a; b++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}
