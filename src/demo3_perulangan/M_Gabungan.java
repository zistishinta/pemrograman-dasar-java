package demo3_perulangan;

import java.util.Scanner;
import demo3_perulangan.A_bintangRataKiri_input;
import demo3_perulangan.K_bintangKetupat;
import demo3_perulangan.L_bintangBalik;

public class M_Gabungan {

    public static void main(String[] args) {
            System.out.println("Pilih menu pola :");
            System.out.println("1. Bintang Rata Kiri");
            System.out.println("2. Bintang Rata Kanan");
            System.out.println("3. Bintang Kolom");
            System.out.println("4. Bintang Triangular");
            System.out.println("5. Bintang Segitiga");
            System.out.println("6. Bintang Segitiga Sama Sisi");
            System.out.println("7. Bintang Kotak");
            System.out.println("8. Bintang Trapesium");
            System.out.println("9. Bintang Simetris");
            System.out.println("10. Bintang Segiempat");
            System.out.println("11. Bintang Belah Ketupat");
            System.out.println("12. Bintang Balik");
            System.out.println("------------------------------");
            
            Scanner data = new Scanner(System.in);
            System.out.println("Pilih menu ke berapa?");
            int pilih = data.nextInt();
            System.out.println("-------------------------------");
                        
            if (pilih == 1) {
                demo3_perulangan.A_bintangRataKiri_input.main(args);
            } else if (pilih == 2) {
                demo3_perulangan.B_bintangRataKanan_input.main(args);
            } else if (pilih == 3) {
                demo3_perulangan.C_bintangKolom.main(args);
            } else if (pilih == 4) {
                demo3_perulangan.D_bintangTriangular.main(args);
            } else if (pilih == 5) {
                demo3_perulangan.E_bintangSegitiga.main(args);
            } else if (pilih == 6) {
                demo3_perulangan.F_bintangSamaSisi.main(args);
            } else if (pilih == 7) {
                demo3_perulangan.G_bintangKotak.main(args);
            } else if (pilih == 8) {
                demo3_perulangan.H_bintangTrapesium.main(args);
            } else if (pilih == 9) {
                demo3_perulangan.I_bintangSimetris.main(args);
            } else if (pilih == 10) {
                demo3_perulangan.J_bintangSegiempat.main(args);
            } else if (pilih == 11) {
                demo3_perulangan.K_bintangKetupat.main(args);
            } else if (pilih == 12) {
                demo3_perulangan.L_bintangBalik.main(args);
            } 
            
            System.out.println("-------------------------------");
            Scanner data2 = new Scanner(System.in);
            System.out.println("Apakah anda ingin lanjut? [Y/N]");
            int yatidak = data2.nextInt();
            if(yatidak == 1) {
            System.out.println("Pilih menu pola :");
            System.out.println("1. Bintang Rata Kiri");
            System.out.println("2. Bintang Rata Kanan");
            System.out.println("3. Bintang Kolom");
            System.out.println("4. Bintang Triangular");
            System.out.println("5. Bintang Segitiga");
            System.out.println("6. Bintang Segitiga Sama Sisi");
            System.out.println("7. Bintang Kotak");
            System.out.println("8. Bintang Trapesium");
            System.out.println("9. Bintang Simetris");
            System.out.println("10. Bintang Segiempat");
            System.out.println("11. Bintang Belah Ketupat");
            System.out.println("12. Bintang Balik");
            System.out.println("------------------------------");
            
            }
            else {
                System.out.println("Selesai");
            }
            
            
            
        }
    }
