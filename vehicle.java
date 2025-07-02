package oops;

abstract class vehicle {
    int no_of_tyres;
   abstract void start();
}
class car extends vehicle{
  void start(){
    System.out.println("start eith key");
  }
}
class scooter extends vehicle{
  void start(){
    System.out.println("start eith kick");
  }
  public static void main(String[] args){
    //vehicle v= new vehicle(); error
    car c=new car();
    c.start();
    scooter s=new scooter();
    s.start();
  }
}
