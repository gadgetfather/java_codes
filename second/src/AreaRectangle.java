import java.util.Scanner;
//Area Of Rectangle Program
public class AreaRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length of rectangle");
        float length = input.nextFloat();
        System.out.println("Enter a width of rectangle");
        float width = input.nextFloat();
        float area = length * width;
        System.out.println(area);
    }
}
