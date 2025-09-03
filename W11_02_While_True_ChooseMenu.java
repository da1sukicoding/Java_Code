package Loop;
import java.util.Scanner;

public class W11_02_While_True_ChooseMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1, num2, sum;
            System.out.print("Enter Your Number = ");
                num1 = kb.nextInt();
                System.out.print("Enter Your Number = ");
                num2 = kb.nextInt();
        
        System.out.println("====================");
        System.out.println("Menu :");
        System.out.println("1. Additon");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("====================");

        while (true) {
            System.out.print("Enter Your Choice : ");
            int Choice = kb.nextInt();
            if (Choice == 1) {
                sum = num1 + num2;
                System.out.println("Your Additon Is "+num1+" + "+num2+" = "+sum);
                System.out.println("====================");
                
            } else if (Choice == 2) {
                sum = num1 - num2;
                System.out.println("Your Subtraction Is "+num1+" - "+num2+" = "+sum);
                System.out.println("====================");

            } else if (Choice == 3){
                System.out.println("You Already Exit This Menu");break;
            }
            else {
                System.out.println("This isn't in Menu");
                System.out.println("====================");
            }
        }
        kb.close();
    }
}
