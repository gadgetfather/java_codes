// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/

public class CountEvenDigitNumbers {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int finalcount= 0;
        for (int i = 0;i<nums.length;i++){
            boolean result = countNum(nums[i]);
            if(result){
                finalcount++;
            }
        }
        System.out.println(finalcount);
    }
    static boolean countNum(int num){
        int count = 0;
//        while (num>0){
//            num = num / 10;
//            count++;
//        }
        count = (int) (Math.log10(num))+1;
        return count%2==0;
    }
}
