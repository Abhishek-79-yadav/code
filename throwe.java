package oops;

import java.util.Scanner;

public class throwe extends RuntimeException{
    throwe(String msg){
        super(msg);
    }
}
class Voting{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=s.nextInt();
        if(age<18){
            throw new throwe("you are not vote");
        }
        else{
            System.out.println("you are vote");
        }
    }
}
