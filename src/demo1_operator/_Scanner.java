package demo1_operator;

import java.util.Scanner;

public class _Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Berapa kata kamu mencintai pemrograman");
        int angka = scan.nextInt();
        for (int i = 0; i < angka; i++)
            System.out.println("Aku Cinta JAVA");
    }
    
}
