package oops;
interface l1{
    void display1();
}
abstract  class ovabstract {
    abstract void display();
    void show() //throws RuntimeException
    {
        System.err.println("1");
    }
}
class Xyz implements l1{
   public void display1(){

   }
    void show()
    {
        System.err.println("2");
    }
    public static void main(String[] args) {
        
        Xyz x=new Xyz();
        x.show();
    }
}
//  class Xyz extends ovabstract{
//     void display(){

//     }
//     void show()
//     {
//         System.err.println("2");
//     }
//     public static void main(String[] args) {
//         // ovabstract oa=new ovabstract();
//         // oa.show();
//         Xyz x=new Xyz();
//         x.show();
//     }
// }
