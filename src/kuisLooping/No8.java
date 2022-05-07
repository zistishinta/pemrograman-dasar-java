package kuisLooping;

import java.util.Scanner;

public class No8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = 1, i = 1, x = 0;
        System.out.println("masukkan angka = ");
        x = input.nextInt();
        while (i <= x) {
            System.out.print(" " + j);
            j = j + i;
            i = i + 1;
        }
    }

}
