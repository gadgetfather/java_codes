// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int peak = pivotBs(arr);
        System.out.println(peak);

        int target = 0;
        int ans = binarySearch(arr,target,peak);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target,int last){
        int start = 0;
        int end = last;
        while (start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid +1;
            } else if(target<arr[mid]){
                end = mid - 1;
            }
        }
        start = last + 1;
        end = arr.length - 1;
        while (start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid +1;
            } else if(target<arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
    static int pivot(int[] arr){
        int max = arr[0];
        int index = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
                index = i;

            }
        }
        return index;
    }
    // pivot with binary search
    static int pivotBs(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start) / 2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return  mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            } else if(arr[start]>=arr[mid]){
                end = mid - 1;
            } else if(arr[start]< arr[mid]){
                start = mid + 1;
            }
        }
        return -1;
            }
}
