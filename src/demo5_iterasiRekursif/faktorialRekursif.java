package demo5_iterasiRekursif;

public class faktorialRekursif {

     public static long factorial(long n) {
         System.out.println("masuk:"+n);
         if (n == 1||n==0)
             return 1;
         return n*factorial(n-1);
     }
     
    public static void main(String[] args) {
        System.out.println("5 faktorial="+factorial(100)); 
    }
    
}
