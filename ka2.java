import java.util.Scanner;

public class ka2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int numStudents; // จำนวนคน
        int score;       // คะแนน
        int passed = 0;  // ผ่าน
        int failed = 0;  // ไม่ผ่าน
        int totalScore = 0; // รวมคะแนนทั้งหมด

        // รับค่าจำนวนนักเรียน
        System.out.print("Enter number of students: ");
        numStudents = kb.nextInt();

        // loop รับคะแนน
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("==============================");

            // ตรวจสอบกรอกคะแนน ตรงไม่ต่ำกว่า 0 ไม่มากกว่า 100 โดยการใช้ while 
            while (true) {
                System.out.print("Enter score for student " + i + " (0-100): ");
                score = kb.nextInt();

                if (score >= 0 && score <= 100) {
                    break; // ถ้าคะแนนถูกต้อง ให้ออกจาก loop
                } else {
                    System.out.println(" Invalid score! Please enter 0 - 100 only.");
                }
            }

            // รวมคะแนนไว้หาค่าเฉลี่ย
            totalScore += score;

            // ตรวจสอบผ่าน/ไม่ผ่าน
            if (score >= 50) {
                System.out.println("Student " + i + " : Passed");
                passed++;
            } else {
                System.out.println("Student " + i + " : Failed");
                failed++;
            }
        }

        // หลัง loop แสดงผลรวม
        System.out.println("==============================");
        System.out.println("Number of students passed = " + passed + " persons");
        System.out.println("Number of students failed = " + failed + " persons");

        // คำนวณค่าเฉลี่ย
        double average = (double) totalScore / numStudents;
        System.out.println("Average score = " + average);

        kb.close();
    }
}