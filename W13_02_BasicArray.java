package Arrays;

public class W13_02_BasicArray {
    public static void main(String[] args) {
        String[] animals = {"pig", "bird", "bear"};
        int dice[] = {1, 2, 3, 4, 5, 6,};
        float avgScore[] = {3.50f, 4.00f, 2.75f};

        System.out.println("Size of animals array : "+animals.length);
        System.out.println("Size of colors array : "+animals.length);
        System.out.println("Color at index 0 : "+animals[0]);
        System.err.println("Color at index 1 :"+animals[2]);
        int i;
        System.out.println("Show average scores : ");
        for (i = 0;i < avgScore.length;i++) {
            System.out.println(avgScore[i]);
        }
        
        
        String colors[] = new String[4];
        colors[0] = "blue";
        colors[1] = "purple";
        colors[3] = "black";

        System.out.println("Show all colors : ");
        for (i = 0;i < colors.length;i++) {
            System.out.println("Colors at index "+(i+1)+" : "+colors[i]);
        }
        System.out.println("Size of colors array : "+colors.length);
        System.out.println("Color at index 0 : "+colors[0]);
        System.err.println("Color at index 1 :"+colors[3]);

        System.out.println("Show average scores : ");
        int scores[] = new int[5];
        scores[0] = 50;

        System.out.println("Score at index 4 : "+ scores[4]);
    }
}
