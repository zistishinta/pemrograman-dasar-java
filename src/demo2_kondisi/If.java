package demo2_kondisi;

public class If {

    public static void main(String[] args) {
        int nilai1  =   8;
        int nilai2  =   7;
        int nilai3  =   5;
        
        float rata_rata = (float)(nilai1 + nilai2 + nilai3)/3;
        if(rata_rata < 5){
            System.out.println("Tudak Lulus");
        }
        System.out.println("Nilai rata rata = "+rata_rata);
    }
    
}
