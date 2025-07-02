package oops;

// public class statick {
//     static int a=10;
//     // void m1(){
//     //     int b=20; //static int b=20; class level variable hi static variable hote h
//     // }
// }
// class demo{
//     public static void main(String[] args) {
//         System.out.println(statick.a);
//     }
// }
class statick{
    int empid;
    String name;
   static String company="TCS";

    statick(int empid,String name) {
           this.empid=empid;
           this.name=name;
           //this.company=company;
    }
   
   void display(){
    System.out.println(empid+" "+name+" "+company);
   }
   public static void main(String[] args) {
       statick e1=new statick(101,"Abhi");
       statick e2=new statick(102,"Deepak");
       e1.display();
       e2.display();
   }
}
