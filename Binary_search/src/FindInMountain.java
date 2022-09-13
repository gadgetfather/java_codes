// https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountain {
    public static void main(String[] args) {
        int[] array = {3,5,3,2,0};
        int target = 3;
        int peak = peakElement(array);
        int answer = binarySearch(array,target,peak);
        System.out.println(answer);
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
        start = end + 1;
        end = arr.length - 1;
        while (start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target<arr[mid]){
                start = mid +1;
            } else if(target>arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start<end){
            int mid = (start + end) / 2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            } else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
        }
        return end;
    }

}
