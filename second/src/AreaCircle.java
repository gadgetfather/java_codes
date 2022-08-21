import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        int radius = input.nextInt();
        float area = (float) ((3.14)*(radius*radius));
        System.out.println(area);

    }
}
