package demo3_perulangan;

public class A_bintangRataKiri {

    public static void main(String[] args) {
        int a = 5;
        
        for (int b=1; b<=a; b++) {
            for (int c=1; c<=b; c++) {
                System.out.print("*");
            }
                System.out.println();
                
        }
    }
    
}
