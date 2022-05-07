package demo1_operator;

public class operatorIncrement {
    public static void main(String[] args) {
        int x=5;
        int a=x++;  // y = x    dan x = x+1
        int b=++x;  // x = x+1  dan y = x
        int c=x--;  // y = x    dan x = x+1
        int d=--x;  // x = x+1  dan y = x
        
        System.out.println("Nilai x = "+x);
        System.out.println("Nilai a = "+a);
        System.out.println("Nilai b = "+b);
        System.out.println("Nilai c = "+c);
        System.out.println("Nilai d = "+d);
        
    }
    
}
