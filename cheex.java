package oops;

import java.io.FileInputStream;

public class cheex {
    public static void main(String[] args) {
        try{
       // FileInputStream fis = new FileInputStream("d:/abc.txt") ;
       //Class.forName("com.mysql.jdbc.Driver");

       int a=100, b=0,c;
       c=a/b;
       System.out.println(c);

    // String name=null; //unchecked exception
    // System.out.println(name.length());
        
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
    }
}
