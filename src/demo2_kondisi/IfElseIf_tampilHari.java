package demo2_kondisi;

import java.util.Scanner;

public class IfElseIf_tampilHari {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan bulat");
        angka = input.nextInt();
        
        if (angka== 1) {
            System.out.println("Senin");
        }
        else if (angka == 2){
            System.out.println("Selasa");
        }
        else if (angka == 3){
            System.out.println("Rabu");
        }
        else if (angka == 4){
            System.out.println("Kamis");
        }
        else if (angka == 5){
            System.out.println("Jumat");
        }
        else if (angka == 6){
            System.out.println("Sabtu");
        }
        else if (angka == 7){
            System.out.println("Minggu");
        }
    }
}