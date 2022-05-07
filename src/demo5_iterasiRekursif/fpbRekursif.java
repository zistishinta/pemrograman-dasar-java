package demo5_iterasiRekursif;

public class fpbRekursif {

    public static int hitungFPB(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return hitungFPB(y,x % y);
        }
    }   
    public static void main(String[] args) {
         System.out.println(hitungFPB(335, 25)); 
    }
    
}
