class Solution {
    public boolean canBeDone(int mid, int[] arr , int k){
         long ans = 0; // Use long to prevent overflow
        for (int i = 0; i < arr.length; i++) {
            ans += (arr[i] + mid - 1L) / mid; // Ceiling division
            if (ans > k) return false; // If time exceeds h, stop early
        }
        return ans <= k;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int si = 1;
        int ei = 0;
        int ans = -1;

        for(int i=0; i<piles.length ; i++){
            ei = Math.max(ei, piles[i]);
        }

        while(si<=ei){
            int mid = si + (ei - si) / 2;
            if(canBeDone(mid, piles, h)){
                ans = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }

        return ans;
    }
}