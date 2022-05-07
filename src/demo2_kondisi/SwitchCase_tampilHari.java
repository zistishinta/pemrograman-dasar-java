package demo2_kondisi;

import javax.swing.JOptionPane;

public class SwitchCase_tampilHari {
    public static void main(String[] args) {
    String x;
    x = JOptionPane.showInputDialog("Masukan Bilangan:n");
    int bilangan = Integer.parseInt(x);
    
    if (bilangan == 1) {
        JOptionPane.showMessageDialog (null, "Hari Minggu");
    }
    else if (bilangan == 2) {
        JOptionPane.showMessageDialog (null, "Hari Senin");
    }
    else if (bilangan == 3) {
        JOptionPane.showMessageDialog (null, "Hari Selasa");
    }
    else if (bilangan == 4) {
        JOptionPane.showMessageDialog (null, "Hari Rabu");
    }
    else if (bilangan == 5) {
        JOptionPane.showMessageDialog (null, "Hari Kamis");
    }
    else if (bilangan == 6) {
        JOptionPane.showMessageDialog (null, "Hari Jumat");
    }
    else if (bilangan == 7) {
        JOptionPane.showMessageDialog (null, "Hari Sabtu");
    }
    else{
        JOptionPane.showMessageDialog (null, "Tidak ada nama hari");
    }
    }
}