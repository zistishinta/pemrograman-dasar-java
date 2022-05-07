package demo3_perulangan;
import demo7_percabangan.*;
import java.util.Scanner;
public class break_bilPrima {

    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    System.out.println("Masukkan sebuah bilangan : ");
    int bil = masukan.nextInt();
    boolean prima = true;
    for(int i=2; i<bil; i++){
        if ((bil % i)== 0) {
            prima = false;
            break;
        }
    }
    if (prima)
        System.out.print(bil + "bilangan PRIMA");
    else System.out.print(bil + "Bukan bilangan PRIMA");
        
    }
}
