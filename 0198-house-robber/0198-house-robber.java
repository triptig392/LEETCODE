class Solution {
    public int rob(int[] arr) {
        int n = arr.length;

        int prev = arr[0];
        int prev2 = 0;

        for(int i=1; i<n; i++){
            int take =  ((i-2)>=0) ? (arr[i]+prev2 ): (arr[i]);
            int nonTake = prev;
            int curr = Math.max(take, nonTake);
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
}