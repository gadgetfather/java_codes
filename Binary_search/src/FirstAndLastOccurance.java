// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr ={5,7,7,8,8,10};
        int[] ans = find(arr,8);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[] arr,int target){
        int[] ans = {-1,-1};
        int start = binarySearch(arr,target,true);
        int last = binarySearch(arr,target,false);
        ans[0] = start;
        ans[1] = last;
        return  ans;

    }
    static int binarySearch (int[]arr,int target,boolean findFirstOccurance) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start<=end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid  + 1;
            } else  {
                ans = mid;
                if(findFirstOccurance){
                    end = mid - 1;
                } else  {
                    start = mid +1;
                }
            }
        }
        return  ans;
    }
}
