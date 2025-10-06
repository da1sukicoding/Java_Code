import java.util.Scanner;
public class ka {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // เริ่มโปรแกรม
        int numStudents; // ประกาศตัวแปรเก็บจำนวนนักเรียน
        int score; // ตัวแปรเก็บคะแนนนักเรียน
        int passed = 0; // ตัวแปรนับคนที่ผ่าน
        int failed = 0; // ตัวแปรนับคนที่ไม่ผ่าน

        // รับค่าจำนวนนักเรียน
        System.out.print("Enter number of students: ");
        numStudents = kb.nextInt();

        // ใช้ loop รับคะแนนตามจำนวนนักเรียน
        for (int i = 1; i <= numStudents; i++) {
            System.out.println("==============================");
            System.out.print("Enter score for student " + i + ": ");
            score = kb.nextInt();

            // ตรวจสอบว่า >= 50 = ผ่าน, น้อยกว่า 50 = ไม่ผ่าน
            if (score >= 50) {
                System.out.println("Student " + i + " : Passed");
                passed++; // เพิ่มจำนวนคนที่ผ่าน
            } else {
                System.out.println("Student " + i + " : Failed");
                failed++; // เพิ่มจำนวนคนที่ไม่ผ่าน
            }
        }

        // หลัง loop แสดงผลรวม
        System.out.println("==============================");
        System.out.println("Number of students passed = " + passed + " persons");
        System.out.println("Number of students failed = " + failed + " persons");

        // จบโปรแกรม
        kb.close();
    }
}
