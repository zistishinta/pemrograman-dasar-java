package demo3_perulangan;

import java.util.Scanner;

public class L_bintangBalik {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        
        System.out.print("Masukkan banyak baris : ");
        int v = data.nextInt();
        int a,b,c;
  
        for(a=0;a<=v;a++){
            for(b=0;b<=a;b++){
                System.out.print(" ");
            }
            for(c=0;c>=(a-v);c--){
                System.out.print("*");
            }
            for(c=0;c<(v-a);c++){
                System.out.print("*");
            }
        System.out.println("");
        }
    }
}
