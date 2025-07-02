package oops;

public class encap {
   private int empid;
   public void setEmpid(int eid){
    empid=eid;
   }
   public int getEmpid(){
    return empid;
   }
}
class company{
    public static void main(String[] args){
        encap e=new encap();
        e.setEmpid(101);
        System.out.println(e.getEmpid());
    }
}
