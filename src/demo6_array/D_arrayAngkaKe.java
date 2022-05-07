
package demo6_array;

public class D_arrayAngkaKe {
    public static void main(String[] args) {
        //mendeklarasikan array 1 dimensi  bernama "angka"
        int angka [];
        
        //kemudian alokasikan sebanyak 5 elemen
        angka = new int[5];
        
        //cetak jumlah elemen pada array "angka"
        System.out.println("Jumlah elemen pada array angka = " +angka.length);
        
        //mengisi setiap elemen dengan data yg sesuai dengan tipe data array
        angka [0] = 5;
        angka [1] = 3;
        angka [2] = 7;
        angka [3] = 4;
        angka [4] = 5;
        
        //cetak isi array pada indeks ke1
        System.out.println("Array angka indeks ke-1 = " +angka[1]);
        
        //cetak isi array pada indeks ke2
        System.out.println("Array angka indeks ke-2 = " +angka[2]);
        
        //cetak isi array pada indeks ke3
        System.out.println("Array angka indeks ke-3 = " +angka[3]);
        
        //cetak isi array pada indeks ke4
        System.out.println("Array angka indeks ke-4 = " +angka[4]);
    }
}
