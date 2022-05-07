package demo1_operator;

import java.util.Scanner;

public class Shortcut_gajiKaryawan {
    private static boolean isBonusGaji;
    public static void main(String[] args) {
        int gaji, prestasi;
        int standarGaji = 1000000;
        int standarPrestasi = 60;
        
        boolean isBonusGaji;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan gaji =");
        gaji = input.nextInt();
        
        System.out.println("Masukkan Prestasi");
        prestasi = input.nextInt();
                
        isBonusGaji =(gaji < standarGaji) && (prestasi > standarPrestasi);
        System.out.println(isBonusGaji);           
    }
}
