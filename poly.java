 class poly{

   // void show() //number of arg
   // void show(int a,String b) //sequnce
   void show(int a) //type
    {
        System.out.println("1");
    }
    //void show(int a)
    //void show(String a,int b)
    void show(String a)
      {
        System.out.println("2");
    }
    public static void main(String[] args) {
        poly p=new poly();
        p.show(7);
        p.show("abc");
    }
}