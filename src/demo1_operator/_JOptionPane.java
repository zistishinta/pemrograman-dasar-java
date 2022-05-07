package demo1_operator;

import javax.swing.JOptionPane;

public class _JOptionPane {
    public static void main(String[] args) {
    String name;
    int umur;
    float gajipokok = (float) 3653987;
    String tunj_suamiistri = null;
    String total_tunj_suamiistri = null;
    int jml_anak;
    
    name = JOptionPane.showInputDialog("Masukkan nama anda:");
        System.out.println(name);
        String msg ="Hello " + name + "!";
        JOptionPane.showMessageDialog(null,msg);
       
    umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur"));
        System.out.println(umur);
        
    int yesorno = JOptionPane.showConfirmDialog(null, "yes or no");
        System.out.println(yesorno);
        
    //----------------------------------
    
    
    
    }
    
}
