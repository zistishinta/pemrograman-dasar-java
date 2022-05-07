package demo1_operator;

public class operatorLogikaOR {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test= false;
        //Logika OR ||
        test = (i < 10) || (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        //Logika NOR |
        test = (i < 10) | (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
    
}
