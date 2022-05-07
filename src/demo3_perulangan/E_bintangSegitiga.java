package demo3_perulangan;

import java.util.Scanner;

public class E_bintangSegitiga {

    public static void main(String[] args){
        int n;
        int a, b=0, c, d, e;
        System.out.println("Masukkan baris : ");
        Scanner input = new Scanner(System.in);
        n=input.nextInt();

        a = n;
        e = n-1;
        for(c=1;c<=n;c++){
            b = 1;
        for(d=1;d<=a;d++) {
            if (b<=e) {
                System.out.print(" ");
                b++;
            } else {
                if(d==b||d==a||e==0){
            System.out.print("*");
            }else
            System.out.print(" ");
            }
        }
        e--;
        a++;
        System.out.print("\n");
        }
    }
}  



//
//public static void main(String[] args) {
//       int a = 5;
//       for (int b=1; b<=a; b++){
//           for (int c=4; c>=b; c--) {
//               System.out.print(" ");
//           }
//           for (int d=1; d<=b; d++){
//               System.out.print("*");
//           }
//           for (int l=1; l<=b-1; l++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }
//}
//    
//}
