package Loop;
import java.util.Scanner;

public class W12_02_SumNumber {
    public static void main(String[] args) {
        int i,Start, Stop,j = 0,sum = 0;
        Scanner kb = new Scanner(System.in);
            do {
            System.out.println("Your  Starting Number must lower than Stop Number");
            System.out.print("Enter your Start Number = ");
            Start = kb.nextInt();
            System.out.print("Enter your Stop Number = ");
            Stop = kb.nextInt();            
            if (Start < Stop)
            for (i = Start; i <= Stop; i++) {
                j++;
                System.out.println("No." + j + " : " + sum + " + " + i + " = " + (sum += i));
                
            }else {
                    System.out.println("Your  Starting Number must lower than Stop Number");
                }
            kb.close();
            }while (Start >= Stop);
        }
}
