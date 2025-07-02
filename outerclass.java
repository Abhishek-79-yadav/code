package oops;

public class outerclass {
    //Fields(variables)
    int a=10;
    static int b=20;
    //static
    static {
        System.out.println("static block");
    }
    //instance
    {
        System.out.println("Instance block");
    }
    //constructor
    public outerclass(){
        System.out.println("Constructor");
    }
    //method
    public void display(){
        System.out.println(a);
        System.out.println(b);
    }
    //ststic method
    public static void staticMethod(){
        System.out.println("call static");
    }
    //nested class
    class InnerClass{
        void showInner(){
            System.out.println("inside inner class method");
            System.out.println("accessing outer class variable "+ a);
        }
    }
    //main method
    public static void main(String[] args) {
        System.out.println("main method started");
        
        //create object outer class
        outerclass outer= new outerclass();
        outer.display();

        //call static method
        outerclass.staticMethod();

        outerclass.InnerClass Inner = outer.new InnerClass();
        Inner.showInner();
        }
}
