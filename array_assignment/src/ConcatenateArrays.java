import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] result = getConcatenation(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[nums.length*2];

        for(int i = 0; i< nums.length;i++){
            nums2[i] = nums[i];
            nums2[i+nums.length] = nums[i];
        }


        return nums2;
    }
}
