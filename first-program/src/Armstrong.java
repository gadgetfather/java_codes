import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Armstrong {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first number");
        int start = input.nextInt();
        System.out.println("Enter a second number");
        int end = input.nextInt();


        // to count digits
        for (int i = start;i<end;i++){
            int power_sum = 0,digit_count=0;
            int x = i;
            while (x!=0){
                x = x/10;
                digit_count++;
            }
            x= i;
            while (x!=0){
                int last_digit=x%10;
                power_sum = (int) (power_sum+ Math.pow(last_digit,digit_count));
                x=x/10;
            }
            if (power_sum == i){
                System.out.println(power_sum);
            }
        }


    }
}
