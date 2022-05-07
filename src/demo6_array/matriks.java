package demo6_array;

public class matriks {

    public static void main(String[] args) {
        int m[][] = {{7, 2, 32}, {3, 5, 12}};
        // i baris j kolom
        //menampilkan matriks m 
        System.out.println("matriks m :");
        for (int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++) {
                System.out.print(m[i][j] +" ");
            }
            System.out.println(); }
        }
    }
