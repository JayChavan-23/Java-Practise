package Day1;

public class code13 {
    public static void main(String args[]) {
            int count =0 , number = 563642315;
            while(number!=0){
                number /= 10;
                count++;
            }
            System.out.print("The number is "+ count+" number long");
    }
}
