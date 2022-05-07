package demo3_perulangan;

import demo7_percabangan.*;

public class breakLabeled {

    public static void main(String[] args) {
        int i=1;
        mulaiLoop:
        while(i<=5){
            System.out.println("saya sedang belajar Java");
            if(i==3){
                break mulaiLoop;
            }
            i++;
        }
    }
    
}
