public class neon{
    public  static void main(String[] args) {
        int a,s1=0;
        int num=9;
       int  s=num*num;
       while(s>0){
        a=s%10;
       s1=a+s1;
       s=s/10;
       }
       if(num==s1){
        System.out.println("It is neon");
       }
       else{
        System.out.println("Not neon");
       }
    }
}