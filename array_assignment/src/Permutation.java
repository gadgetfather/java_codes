import java.util.Arrays;

//https://leetcode.com/problems/build-array-from-permutation/
public class Permutation {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] result = buildArray(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] buildArray(int[] nums) {
        int[] arr =new int[nums.length];
        for(int i = 0;i<nums.length;i++){

            arr[i]=nums[nums[i]]      ;
        }
        return arr;
    }
}
