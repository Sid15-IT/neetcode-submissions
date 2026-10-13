
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // First loop: Calculate left product
        int prod = 1;

        for (int i = 0; i < n; i++) {
            answer[i] = prod;
            prod = prod * nums[i];
        }

        // Second loop: Multiply by right product
        prod = 1;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * prod;
            prod = prod * nums[i];
        }

        return answer;
    }
}
