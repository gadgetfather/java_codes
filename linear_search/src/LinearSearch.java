public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int target = 5;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return  -1;
    }
}
