package oops;

public class staticm {
   static int i=10;
    static void display(){
        show();
        System.out.println(i);
    }
    static void show(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        display();
        Xyz.show();
    }
}
class Xyz{
    static void show(){
        System.out.println("2");
    }
}
