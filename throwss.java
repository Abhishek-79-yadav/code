package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class throwss {
    void  readFile() throws FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("d:/abc.txt");
    }
    void saveFile() throws FileNotFoundException{
        String text="this is demo";
        FileOutputStream fos=new FileOutputStream("d:/xyz.txt");
    }
}
class Text{
    public static void main(String[] args) {
        throwss ts=new throwss();
        try{
            ts.readFile();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }
}
