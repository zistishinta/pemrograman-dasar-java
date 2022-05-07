package demo1_operator;

import java.io.*;

public class _BufferedReader {
    public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
    String name = "";
        
    try{
        System.out.print("Please Enter Your Name:");
    
        name = dataIn.readLine();
    }
    catch( IOException e ){
        System.out.println("Error!");
    }
        System.out.println("Hello " + name +"!");
    }
}
