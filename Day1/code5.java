package Day1;

import java.util.Scanner;

//Java Program to Swap Two Numbers

public class code5 {
    public static void main(String args[]){
        int num1,num2;
        System.out.print("Enter first number :");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.print("Enter second number :");
        num2 = sc.nextInt();

        System.out.println("Before swap");
        System.out.print("\nFirst number : "+num1);
        System.out.print("\nSecond number : "+num2);
        int temp=0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap");
        System.out.print("\nFirst number : "+num1);
        System.out.print("\nSecond number : "+num2);

    }

}
