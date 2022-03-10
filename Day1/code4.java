package Day1;

import java.util.Scanner;

//Multiply Two Floating-Point Numbers taken by user
public class code4 {
    public static void main(String[] args){
        float num1,num2;
        try{
            Scanner sc  = new Scanner(System.in);
            num1 = sc.nextFloat();
            num2 = sc.nextFloat();
            System.out.println("Multiplication "+(num1*num2));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
