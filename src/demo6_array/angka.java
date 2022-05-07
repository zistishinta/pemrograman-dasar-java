package demo6_array;

public class angka {
    public static void main(String[] args) {
        
        int angka[] = new int[10]; 
        
        for(int i=1;i<10;i++)
            angka[i]=i;
        for(int i=1;i<10;i++)
            System.out.print(angka[i]);
        System.out.println();
        
        char huruf[] = {'a','b','c','d','e','f'};
        for(int i=0; i<huruf.length; i++)
            System.out.print(huruf[i]); 
}
}
