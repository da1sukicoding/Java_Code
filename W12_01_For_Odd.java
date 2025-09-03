package Loop;
import java.util.Scanner;

public class W12_01_For_Odd {
    public static void main(String[] args) {
        int i, Start, Stop, sum = 0, j = 0;
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter your Start Number = ");
            Start = kb.nextInt();
            System.out.print("Enter your Stop Number = ");
            Stop = kb.nextInt();

            while (Start <= Stop){
            System.out.println("Your  Starting Number must lower than Stop Number");
            System.out.print("Enter your Start Number = ");
            Start = kb.nextInt();
            System.out.print("Enter your Stop Number = ");
            Stop = kb.nextInt();
            }
            // if (Start < Stop)
            for (i = Start; i <= Stop; i++) {
                j++;
                System.out.println("No." + j + " : " + sum + " + " + i + " = " + (sum += i));
                    // if ( i % 2 != 0) {
                    // System.out.println("No."+j+" : "+sum+" + "+i+" = "+(sum+=i));
            }
            // else {
            //     System.out.println("Your  Starting Number must lower than Stop Number");
        }
}
//     }

// }
