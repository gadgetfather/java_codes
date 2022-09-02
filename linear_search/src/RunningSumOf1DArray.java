import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1DArray {
    public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    int [] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j<=i;j++){
                int sum = 0;
                sum = sum + arr[j];
                System.out.println(sum);
                newArr[i] = sum;
            }
        }
        return  newArr;
    }
}
