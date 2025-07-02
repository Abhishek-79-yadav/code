package oops;

public class finalsp {
    //final void show() //cannot override
    // static void show() //cannot override
    //private void show()
    //synchronized void show()
     void show()
    {
        System.out.println("1");
    }
}
class Xyz extends finalsp{
    //synchronized void show()
    void show(){
        System.out.println("2");
    }
    public static void main(String[] args){
        finalsp sp=new finalsp();
        sp.show();
        Xyz ob=new Xyz();
        ob.show();
    }
}
