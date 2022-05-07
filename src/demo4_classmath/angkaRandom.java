package demo4_classmath;

public class angkaRandom {

    public static void main(String[] args) {
        double x;
        for(int i = 0; i < 10; i++){
            x = Math.random();
            System.out.println("Random 0-100, Nilaike-" + i + " = " + Math.floor((100 * x))); }

    }
    
}
