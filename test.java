package oops;
interface inter {
   public abstract void show();
}
interface inter2{
   void display();
}
public class test implements inter{
   public void show(){
      System.out.println("1");
   }
   public void display(){
      System.out.println("2");
   }
   public static void main(String[] args){
      test t=new test();
      t.show();
      t.display();
   }
}