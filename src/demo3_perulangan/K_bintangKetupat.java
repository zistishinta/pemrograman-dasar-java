package demo3_perulangan;

public class K_bintangKetupat {

    public static void main(String[] args) {
        int l = 1;
        int n = 6;
        for(int a=1; a<=n; a++){
            for(int b=n;b>a; b--){
                System.out.print(" ");
            }
            for(int c=1; c<=l; c++){
                System.out.print("*");
            }
            l+=2;
            System.out.println("");
            }
            l -= 4;
            for(int a=(n-1); a>=1; a--){
                for(int b=a; b<=(n-1); b++){
                    System.out.print(" ");
            }
            for(int c=l; c>=1; c--){
                System.out.print("*");
            }
            l-=2;
            System.out.println("");
        }
    }
    
}
