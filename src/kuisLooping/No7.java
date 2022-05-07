package kuisLooping;

import java.util.Scanner;

public class no7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = 1, i = 1, x = 0;
        System.out.println("masukkan angka = ");
        x = input.nextInt();
        while (i <= x) {
            j = i * i * i;
            System.out.print(" " + j);
            i = i + 1;
        }

    }

}
