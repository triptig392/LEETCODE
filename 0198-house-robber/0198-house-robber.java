class Solution {
    public int helper(int[] arr, int i, int[] dp){
        if(i==0){
            return arr[i];
        }
        if(i<0){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int pick = arr[i]+helper(arr, i-2, dp);
        int nonPick = helper(arr, i-1, dp);

        return dp[i] = Math.max(pick, nonPick);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, nums.length-1, dp);
    }
}