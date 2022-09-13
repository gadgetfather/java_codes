import java.util.Arrays;
// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
public class Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] result =candy(candies,extraCandies);
        System.out.println(Arrays.toString(result));
    }
    static boolean[] candy(int[]candies,int extraCandies){
        boolean[] new_arr = new boolean[candies.length];
        int max = candies[0];
        for(int i =0;i<candies.length;i++ ){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int j = 0; j<candies.length;j++){
            if(candies[j]+extraCandies>= max){
                new_arr[j] = true;
            } else{
                new_arr[j] = false;
            }
        }
        return new_arr;
    }
}
