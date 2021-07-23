class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            if (i == 0) {
                ans[i] = 1;
                continue;
            }
            ans[i] = ans[i - 1] * nums[i - 1];
        }
        int p = 1;
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * p;
            p = p * nums[i];
        }
        return ans;
    }
}