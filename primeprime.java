public class primeprime {
    public static void main(String [] args){
        int x=100;
        for (int i = 2; i <=x; i++) {
            if(i==2||i==3||i==5 ||i==7){
                System.out.println(i);
            }
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){

                System.out.println(i);
        }
        }
    }
}
    
