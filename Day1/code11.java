package Day1;

import java.util.Scanner;

//fibonacci series
public class code11 {
    public static void main(String args[]){
            System.out.print("Enter number till the range of fibonnaci series");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int t1 = 0 ;
            int t2 = 1;
            int t3;
            for(int i = 1 ;i<=n;i++){
                System.out.print(" "+t1+" ");
                t3=t1+t2;
                t1=t2;
                t2=t3;
            }
    }
}
