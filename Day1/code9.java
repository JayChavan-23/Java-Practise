package Day1;
//Java Program to Calculate the Sum of Natural Numbers

import java.util.Scanner;

public class code9 {
    public static void main (String args[]){
        System.out.println("Enter the number you want to find sum :");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int sum = 0;

        for(int i = 0 ; i <=num;i++){
            sum = sum +i;
        }
        System.out.println("The sum is "+sum);
    }
    
}
