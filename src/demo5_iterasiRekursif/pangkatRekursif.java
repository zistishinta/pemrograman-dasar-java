package demo5_iterasiRekursif;

public class pangkatRekursif {

    public int HitungPangkat(int x, int y){
        if(y==1){
            return x;
        }   else {
            return x * HitungPangkat(x,y-1);
        }
    }
    
    public static void main(String[] args) {
        pangkatRekursif p = new pangkatRekursif();
        System.out.print("3 pangkat 6 =  "); 
        System.out.println(p.HitungPangkat(3,6));
    }
}
