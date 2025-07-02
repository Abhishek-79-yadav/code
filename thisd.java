package oops;
// class test{ //5
//     test(thisd td){
//         System.err.println("test class constuctor");
//     }
// }
public class thisd {
    // int i;
    // void setValue(int i)
    // void display()
    //  thisd()
    // {
    //     // this.i=i;
    //     this(10);
    //     System.out.println("no arg constuctor"); 
    // }
    // // void show()
    // thisd(int a) 
    // {
    //     // System.out.println(i);
    //     //display(); //this.display();   //if you donot use the this keyword compiler automatically adds this keyword while invoking the method
    //     //this(); //call current call constructor
    //     System.out.println("parametrised constructor");
    // }
    // void m1(thisd s){
    //       System.out.println("call m2 method m1");
    // }
    // void m2(){
    //     m1(this); //pass as an argument in the mwthod call
    // }
    thisd m1(){
        //test t=new test(this); //pass as an argument in the constructor call
        return  this; //return the current class instance from the menthod
    }

    public static void main(String[] args) {
        // thisd td=new thisd(10);
        // td.setValue(100);
        // td.show();
        thisd t=new thisd();
        t.m1();

    }
}
