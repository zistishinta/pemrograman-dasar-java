package demo2_kondisi;

public class IfElse_HasilUjian {
    public static void main(String[] args) {
        int nilai1 = 8;
        int nilai2 = 7;
        int nilai3 = 5;
        float rata_rata = (float) (nilai1 + nilai2 + nilai3) / 3;
        
        if (rata_rata < 5) {
        System.out.println("Tidak Lulus");
        } else if ((rata_rata >= 5) && (rata_rata < 6)) {
        System.out.println("Harus ikut ujian perbaikan");
        } else {
        System.out.println("Lulus");
        }
        System.out.println("Nilai rata-rata = " + rata_rata);
    }
    
}
