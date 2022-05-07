package demo6_array;

public class M2Menjumlahkan {

    public static void main(String[] args) {
        int mA [] [] = {{7, 2, 32}, {3, 5, 12}};
        int mB [] [] = {{8, 21, 3}, {3, 6, 10}};
        
        //menampilkan matriks m
        System.out.println("Matriks A: ");
        for (int i=0; i<mA.length; i++) {
            for(int j=0; j<mA[i].length; j++) {
                System.out.println(mA[i][j] +" ");
            }
            System.out.println(i);
        }
        
        //menampilkan matriks n.1
        System.out.println("Matriks n.1 : ");
        for (int i=0;i<mB.length; i++) {
            for(int j=0; j<mB[i].length; j++) {
                System.out.println(mB[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
