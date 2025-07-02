package oops;

public class overri {
    //void show()
    //void show(int a, String b)
    void show(String a)
    {
        System.out.println("1");
    }
}
class Xyz extends overri{
    //void show()
    //void show(int a,String b )
    void show(String a)
    {
        System.out.println("2");
    }
    public static void main(String[] args) {
        overri o=new overri();
        o.show("abd");
        Xyz x=new Xyz();
        x.show("abd");
        }
}
