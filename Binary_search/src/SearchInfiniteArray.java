public class SearchInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,10,11,12,15,20,23};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static int ans(int[] arr,int target){
        // first box size will be 2
        int start = 0;
        int end = 1;
        // if target is bigger than end element we will increase the chunk size.
        if(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){

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
}
