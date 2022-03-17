package Day1;
import java.util.Scanner;

public class code10 {
    public static void main (String args[]){
        System.out.println("Enter the number you want to find factorial :");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int factorial = 1;

        for(int i = 1 ; i <=num;i++){
            factorial = factorial *i;
        }
        System.out.println("The factorial is "+factorial);
    }
    
}
