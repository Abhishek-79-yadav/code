package oops;

public class overloading {
    void show(){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    public static void main(String[] args) {
        overloading o=new overloading();
        o.show(10);
    }
}
