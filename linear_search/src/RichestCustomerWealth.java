// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        int wealthy = 0;
        for(int i = 0;i<accounts.length;i++){
            int individualBalance = findWealthiest(accounts[i]);
            if(wealthy<individualBalance){
                wealthy = individualBalance;
            }

        }
        System.out.println(wealthy);
    }
    static int findWealthiest(int[] arr){
        int balance = 0;
        for (int i = 0; i<arr.length;i++){
            balance = balance + arr[i];
        }
        return  balance;
    }
}
