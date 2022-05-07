package demo5_iterasiRekursif;

public class fibonanciRekursif {

    public static long fibbonanci(long x){
        if (x<=0 || x<=1){
            return 1; }
        else{
            return fibbonanci(x-2)+fibbonanci(x-1);
        }
    }   
    public static void main(String[] args) {
         int n=10;
         
         for(int i=0;i<n;i++){
             System.out.println(fibbonanci(i)+" ");
         } 
    }
    
}
