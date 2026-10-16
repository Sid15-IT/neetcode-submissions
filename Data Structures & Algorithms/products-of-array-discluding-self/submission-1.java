
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        // First loop: Calculate left product
        int prod = 1;
        for(int i=0;i<nums.length;i++){
            answer[i]=prod;
            prod=nums[i]*prod;
        }
        prod=1;
        for(int i=nums.length-1;i>=0;i--){
            answer[i]=answer[i]*prod;
            prod=prod*nums[i];
        }

        return answer;
    }
}
