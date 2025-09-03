package Loop;
import java.util.Scanner;

public class W11_04_doWhile_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num1, num2, sum;

        
        System.out.println("====================");
        System.out.println("Menu :");
        System.out.println("1. Additon");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("====================");

        int Choice;
        do { 
        System.out.print("Enter Your Choice : ");
        Choice = kb.nextInt();
        switch (Choice) {
            case 1:
                System.out.print("Enter Your Number = ");
                num1 = kb.nextInt();
                System.out.print("Enter Your Number = ");
                num2 = kb.nextInt();

                
                sum = num1 + num2;
                    System.out.println("Your Additon Is "+num1+" + "+num2+" = "+sum);
                    System.out.println("====================");
                break; // ออกจาก switch case

            case 2:
                System.out.print("Enter Your Number = ");
                num1 = kb.nextInt();
                System.out.print("Enter Your Number = ");
                num2 = kb.nextInt();
                
                sum = num1 - num2;
                    System.out.println("Your Subtraction Is "+num1+" - "+num2+" = "+sum);
                    System.out.println("====================");
                break;

            case 3:
                    System.out.println("You Already Exit This Menu");
                    System.out.println("====================");
                break;
                default: // อื่นๆ อารมณ์แบบ else เป็นตัวปิดท้าย
                    System.out.println("This isn't in Menu");
                    System.out.println("===================="); 
                    break;
            }
        }while(Choice != 3);
    }
    
}




// while (true) {
        //     System.out.println("Enter Your Choice : ");
        //     int Choice = kb.nextInt();
        //     switch (Choice) {
        //         case 1:
        //         sum = num1 + num2;
        //             System.out.println("Your Additon Is "+num1+" + "+num2+" = "+sum);
        //             System.out.println("====================");
        //         break;
        //         case 2:sum = num1 - num2;
        //             System.out.println("Your Subtraction Is "+num1+" - "+num2+" = "+sum);
        //             System.out.println("====================");
        //         break;
        //         case 3:
        //             System.out.println("You Already Exit This Menu");
        //             System.out.println("====================");
        //         break;
        //         // default:
        //         //     System.out.println("This isn't in Menu");
        //         //     System.out.println("===================="); 
        //         //     break;
        //     }
            
        //     if (Choice == 1) {
        //         break;
        //     }
        //     else if (Choice == 2) {
        //         break;
        //     }
        //     else if (Choice == 3) {
        //         break;
        //     }
        //     else {
        //         System.out.println("This isn't in Menu");
        //         System.out.println("===================="); 
        //         break;
        //     }
        // }


// System.out.print("Enter Your Choice : ");
            // int Choice = kb.nextInt();
            // if (Choice == 1) {
            //     sum = num1 + num2;
            //     System.out.println("Your Additon Is "+num1+" + "+num2+" = "+sum);
            //     System.out.println("====================");
                
            // } else if (Choice == 2) {
            //     sum = num1 - num2;
            //     System.out.println("Your Subtraction Is "+num1+" - "+num2+" = "+sum);
            //     System.out.println("====================");

            // } else if (Choice == 3){
            //     System.out.println("You Already Exit This Menu");break;
            // }
            // else {
            //     System.out.println("This isn't in Menu");
            //     System.out.println("====================");
            // }