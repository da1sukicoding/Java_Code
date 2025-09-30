public class HW15_Even_Odd_Array {
    public static void main(String[] args) {
        int i,evencount=0,oddcount=0;
        int x[] = { 7, 9, -1, 4, 12, 9, 3, 2, -7, 2, 1, 9, -15, 24, 11, 13} ;
        for (int num : x) {
            if (num % 2 == 0) {
                evencount++;
            }
            else {
                oddcount++;
            }      
        }

            System.out.println("======================================");
            System.out.println("Sum of Even in array = " + evencount);
            System.out.println("Sum of Odd in array = " + oddcount);
            System.out.println("======================================");
            
        for (i = 0;i < x.length;i++) {
            if (x[i] % 2 == 0) {
                System.out.println("index Even Is "+x[i]);
                evencount += x[i];
            }
            else {
                System.out.println("index Odd Is "+x[i]);
                oddcount += x[i];
            }
            
        }
    }
}
