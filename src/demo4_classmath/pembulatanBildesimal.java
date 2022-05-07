package demo4_classmath;

public class pembulatanBildesimal {

    public static void main(String[] args) {
            double a = 3.71;
            double b = 3.41;

            System.out.println("a = "+a);
            System.out.println("b = "+b);
            System.out.println("Pembulatan ke atas a = "+ Math.ceil(a));
            System.out.println("Pembulatan ke atas b = "+ Math.ceil(b));
            System.out.println("Pembulatan ke bawah a = "+ Math.floor(a));
            System.out.println("Pembulatan ke bawah b = "+ Math.floor(b));
            System.out.println("Pembulatan ke terdekat a = "+ Math.round(a));
            System.out.println("Pembulatan ke terdekat b = "+ Math.round(b));
    }
}
