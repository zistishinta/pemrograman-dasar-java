package demo6_array;

import javax.swing.*;

public class D_kombinasi {
    public static void main(String[] args) {
        int jmlElemen;
        JOptionPane.showMessageDialog(null, "Program Mahasiswa");
        jmlElemen = Integer.parseInt(JOptionPane.showInputDialog("Baerapa jumah data uyang dimasukkan"));
        
        String namaMhs [] = new String [jmlElemen];
        
        for (int index=0; index<jmlElemen; index++) {
            namaMhs [index] = JOptionPane.showInputDialog("Input indeks ke- " +index);
        }
        for (int index=0; index<jmlElemen; index++) {
            System.out.println("Data pada indeks ke- " +index+  "i" +namaMhs[index]);
        }
    }
}
