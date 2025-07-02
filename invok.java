package oops;

public class invok {
    void show(){
        System.err.println("1");
    }
}
class Xyz extends invok{
    void show(){
        super.show();
        System.err.println("2");
    }
    public static void main(String[] args) {
        Xyz ob=new Xyz();
        ob.show();
    }
}