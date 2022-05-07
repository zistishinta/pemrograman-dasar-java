package demo6_array;

public class D_arrayNilai {

    public static void main(String[] args) {
        int[] nilaiKelas = new int[5];
        nilaiKelas[0] = 100;
        nilaiKelas[1] = 85;
        nilaiKelas[2] = 75;
        nilaiKelas[3] = 88;
        nilaiKelas[4] = 90;
        
        System.out.println(nilaiKelas[3]);
        nilaiKelas[3] = 80;
        System.out.println(nilaiKelas[3]);
    }   
}
