package Arrays;

import java.util.Scanner;

public class W15_02_sumNumber {
    public static void main(String[] args) {
        int i;
        double sum = 0,sumOdd = 0,sumEven = 0,avg = 0,max = 0,min=999999;
        Scanner kb = new Scanner(System.in);
        double a [] = new double[5];
        for (i = 0; i < a.length;i++) {
            System.out.print("Enter your Number "+(i+1)+" : ");
            a[i] = kb.nextDouble();
            sum += a[i]; //sum += i
        }

        for (i = 0; i < a.length;i++) {
            System.out.println("index No["+i+"] = "+a[i]);
        }

        for (i = 0; i < a.length;i++) {
            if (a[i] % 2 != 0) {
                System.out.println("index Odd No["+i+"] = "+a[i]);
                sumOdd += a[i];
            }
            else {
                System.out.println("index Even No["+i+"] = "+a[i]);
                sumEven += a[i];
            }
            
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
            avg = sum / a.length;

        }
        System.out.println("===============================");
        System.out.println("Sum of all array = "+sum);
        System.out.println("Sum of Odd array = "+sumOdd);
        System.out.println("Sum of avg array = "+avg);
        System.out.println("Max Number = "+max);
        System.out.println("Min Number = "+min);
        System.out.println("===============================");
        kb.close();
    }
}
