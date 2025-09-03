package Loop;
public class W11_06_Even10 {
    public static void main(String[] args) {
        int i = 2 , sum = 0; // sum ตัวแปรเก็บผมรวม
        for (i = 2; i <= 20; i++)
        if (i % 2 == 0 && i != 20) {
            sum += i;
            System.out.print(i + " + ");
        } else if (i == 20) {
            sum += i;
            System.out.print(i + " = " + sum);
        }
        
        // for(i = 2; i <=20; i+=2) { //ถ้าเรา i=2 แล้วใส่ ค่าเพิ่ม i+=2 ก็จะบวกเพิ่มไปทีละ2 เช่น 2 4 6 8 ถ้าใส่เงื่อนใข i <= 10 จะได้ออกมา5ตัว 2 4 6 8 10
        //     if (i < 20) { // i = 20 < 20 จะวิ่งไปelse
        //         System.err.print(i+" + "); //น้อยกว่า20จะมีเครื่องหมายบวกตามหลัง
        //     }
        //     else {
        //         System.out.print(i+" = ");
        //     }
        //     sum += i; // นำค่า แต่ละค่า มาบวกกับ sum
            
        // }
        // System.out.println(sum);
    }

}
