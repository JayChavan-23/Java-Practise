package Day1;
//Java Program to Find the Largest Among Three Numbers

import java.util.Scanner;
//Find Largest Among three numbers using if..else statement
public class code8 {
    public static void main(String args[]){
            checkNum();       
    }

    private static void checkNum() {
        Scanner sc = new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter first number :");
        n1 = sc.nextInt();
        System.out.print("Enter second number :");
        n2 = sc.nextInt();
        System.out.print("Enter third number :");
        n3 = sc.nextInt();

        if(n1>=n2 && n1>=n3){
            System.out.println("Largest number is :"+n1);
        }
        else if(n2>=n1 && n2>=n3){
            System.out.println("Largest number is :"+n2);
        }
        else if(n3>=n2 && n3>=n1){
            System.out.println("Largest number is :"+n3);
        }
    }
}
