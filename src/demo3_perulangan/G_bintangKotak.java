package demo3_perulangan;

import java.util.Scanner;

public class G_bintangKotak {

    public static void main(String[] args) {
        int sisi;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Panjang sisi = ");
        sisi = input.nextInt();
        
        System.out.println("\nPersegi (kotak):");
        for (int x = 0; x < sisi; x++) {
            for (int y = 0; y < sisi; y++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
