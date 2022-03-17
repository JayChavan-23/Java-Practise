package Day1;

import java.util.Scanner;

//Java Program to Check Whether an Alphabet is Vowel or Consonant

public class code7 {
    public static void main(String args[])
    {
        char input ;
        System.out.println("Enter the Character :");
        Scanner sc = new Scanner(System.in);
        input = sc.next().charAt(0);
        



        Object check = new Object();
        check(input);
    }

    private static void check(char input) {
        switch(input){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                System.out.println("Its a vowel");
                break;
            default:
            System.out.println("Its a Consonant");
        }
    }

    
}
