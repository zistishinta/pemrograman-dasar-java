package demo6_array;

public class array_alamat {
    public static void main(String[] args) {
        String nama[][] = {{"Siti","73087","Surabaya"},
                           {"Salma","975768","Sidoarjo"},
                           {"Sasa","8758970","Gresik"}};
            for(int i=0;i<nama.length;i++){
                int n = i+1;
                System.out.println("Data ke-"+n);
                System.out.print("Nama     : ");
                System.out.println(nama[i][0]);
                System.out.print("Telpon # : ");
                System.out.println(nama[i][1]);
                System.out.print("Alamat   : ");
                System.out.println(nama[i][2]);
                System.out.println();
        }
    }
}
