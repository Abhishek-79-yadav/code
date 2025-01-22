import java.util.ArrayList;
class Demo{

public static ArrayList<Integer> isprime(int n){
ArrayList<Integer> myarr=new ArrayList<>();
int flag=0;
  for(int i=2;i<n;i++){
   for(int j=2;j<i;j++){
   if(i%j==0){
     flag=1;
}
}
if(flag==0){
myarr.add(i);
}
flag=0;
}
return myarr;
}
public static void main(String args[]){
ArrayList<Integer> myarray1=new ArrayList<>();
 myarray1=isprime(36);
for(int i=0;i<myarray1.size();i++){
 for(int j=i;j<myarray1.size();j++){

  if(myarray1.get(i)+myarray1.get(j)==34){
   System.out.println(myarray1.get(i)+" "+myarray1.get(j));
}    
}
}

}

}