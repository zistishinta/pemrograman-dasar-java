package demo1_operator;

public class operatorLogikaAND {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test= false;
        //logika AND &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
//        //boolean logika AND &
//        test = (i > 10) & (j++ > 9);
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(test);
    }
}
