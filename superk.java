package oops;

public class superk {
    //int i=10;
//     void m1(){
//     System.out.println("i am in class a");
// }
 superk(){
System.out.println("A Constructor");
}
}
class b extends superk{
    //int i=20;
    // void m1(){
    //     System.out.println("i am class b");
    // }
    b(){
        super();  
        System.out.println("b constructor");
    }
    // void show(){
    //     //System.out.println(i);
    //     //System.out.println(this.i);
    //     //System.out.println(super.i);
    //     m1();
    //     super.m1();
    // }
    public static void main(String[] args) {
        b ob=new b();
        // ob.show();
    }
}