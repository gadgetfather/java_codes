import java.lang.reflect.Array;
import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
