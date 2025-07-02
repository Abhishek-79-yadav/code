package oops;

public class overriding {
    void show()
    //void show() throws RuntimeException
    {
        System.out.println("1");
    }
}
class Xyz extends overloading{
    //void  show()
    void show() throws ArithmeticException
    //void show () throws  RuntimeException
    //void show() throws Exception //error
    {
        System.err.println("2");
    }
    public static void main(String[] args) {
        overloading oe=new overloading();
        oe.show();
        Xyz ob=new Xyz();
        ob.show();
    }
}
