package demo3_perulangan;

import demo7_percabangan.*;

public class continueUnlabeled {

    public static void main(String[] args) {
        int i = 1;
        int j;
        while (i <= 5) {
            for (j = 1; j <= i; j++) {
                if (i == 4) {
                    continue;
                }
                System.out.print(i);
            }
            System.out.println("");
            i++;
        }
    }
    
}
