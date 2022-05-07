package kuisLooping;

public class No6 {

    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(" cek " + i);
            i = i + 1;//jika 0+1=1 * 2=2 
            //dicek kembali ke 2+1*2=6 
            //lalu cek lagi angka 3 + 1*2=8 
            //cek lagi di angka 4+1*2=10
            System.out.print("(" + i * 2 + ")");

        }
    }

}
