package oops;

public class thiss {
    int i;
    void setValue(int i){
       this.i=i;
    }
    void show(){
        System.out.println(i);
    }
}
class Xyz{
    public static void main(String[] args){
        thiss k=new thiss();
        k.setValue(10);
        k.show();
    }
}
