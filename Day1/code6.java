package Day1;

import java.util.Scanner;

//Java Program to Check Whether a Number is Even or Odd

public class code6 {
    public static void main (String args[]){

        checkNum();

    }

    private static void checkNum() {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Its a even number");
        }
        else{
            System.out.println("Its a odd number");
        }

    }
}
