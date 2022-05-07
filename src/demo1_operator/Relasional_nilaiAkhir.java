
package demo1_operator;

import java.util.Scanner;

public class Relasional_nilaiAkhir {

    public static void main(String[] args) {
    int tugas, uts, uas;
    double nilaiAkhir;
    boolean isPassed;
    
    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan nilai Tugas");
    tugas = input.nextInt();
    
    System.out.println("Masukkan nilai UTS");
    uts = input.nextInt();
    
    System.out.println("Masukkan niali UAS");
    uas = input.nextInt();
    
    nilaiAkhir = (tugas + uts + uas)/3;
    isPassed = nilaiAkhir >=70;
    System.out.println("Lulus / Tidak ?"+isPassed);
    }
    
}
