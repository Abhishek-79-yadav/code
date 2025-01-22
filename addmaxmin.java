import java.util.*;
class Demo{
public static void main(String args[]){
ArrayList<Integer> myarr=new ArrayList<>();
myarr.add(10);
myarr.add(20);
myarr.add(4);
myarr.add(5);
myarr.add(6);
myarr.add(11);
myarr.add(3);
myarr.add(16);
myarr.add(19);
//myarr.add(12);
Collections.sort(myarr);
System.out.println(myarr);
int i=0;
int j=myarr.size()-1;
while(i<j){
System.out.println(myarr.get(i)+myarr.get(j));
i++;
j--;

}
if(i==j){
System.out.println(myarr.get(i));
}


}	

}