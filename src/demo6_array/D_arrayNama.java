package demo6_array;

public class D_arrayNama {

    public static void main(String[] args) {
        int[] nilai=new int[5];
        String nama[]=new String[5];
        char[] index=new char[5];

//        String nama [] = {"Farah", "Farel", "Fiki"};
//        int nilai [] = {60, 70, 80};
        
        nama[0] = "Farah";
        nilai[0]= 60;
        index[0]= 'C';
        nama[1] = "Farel";
        nilai[1]= 70;
        index[1]= 'B';
        nama[2] = "Fiki";
        nilai[2]= 80;
        index[2]= 'A';
        
        

        System.out.println("======================================");
        System.out.println("Nama\t\tNilai\t\tindex");
        System.out.println("======================================");
        System.out.println(nama[0]+"\t\t"+nilai[0]+"\t\t"+index[0]);
        System.out.println(nama[1]+"\t\t"+nilai[1]+"\t\t"+index[1]);
        System.out.println(nama[2]+"\t\t"+nilai[2]+"\t\t"+index[2]);
        //System.out.println(nama[3]+"\t\t"+nilai[3]+"\t\t"+index[3]);

        }   
    }
