package oops;

public class inhe{
    void eat(){
        System.out.println("yes");
    }
}
class Ab extends inhe{
    public static void main (String[] args) {
        Ab a=new Ab();
        a.eat();
    }
}