package kuisLooping;

public class No3 {

    public static void main(String[] args) {
        int i,j ,N;
        
        for (i=1; i<=100; i++) {
            for (j=1; j<=i;j++) {
                j = i*i*i;
                System.out.print(i*i*i);
            }
        System.out.println();
        }
    }
    
}
