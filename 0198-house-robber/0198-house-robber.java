class Solution {
    public int rob(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];

        dp[0] = arr[0];

        for(int i=1; i<n; i++){
            int take =  ((i-2)>=0) ? (arr[i]+dp[i-2] ): (arr[i]);
            int nonTake = dp[i-1];
            dp[i] = Math.max(take, nonTake);
        }

        return dp[n-1];
    }
}