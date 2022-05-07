package kuisLooping;

public class No15 {

    public static void main(String[] args) {
        for (int a = 8; a <= 32;) {
            System.out.print(a + " ");
            if (a < 32) {
                a = (a + 2) * -1;
                System.out.print(a + " ");
                a = (-1 * a) + 2;

            } else {
                break;
            }

        }
    }

}
