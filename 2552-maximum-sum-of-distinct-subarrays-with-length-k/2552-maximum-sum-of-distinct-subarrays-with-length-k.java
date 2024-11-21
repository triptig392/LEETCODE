class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long currentSum = 0;
        int l = 0;
        int r = 0;

        HashMap<Integer, Integer> numToIndex = new HashMap<>();

        while (r < nums.length) {
            int currNum = nums[r];
            int lastOccurrence = numToIndex.getOrDefault(currNum, -1);
            // if current window already has number or if window is too big, adjust window
            while (l <= lastOccurrence || r - l + 1 > k) {
                currentSum -= nums[l];
                l++;
            }
            numToIndex.put(currNum, r);
            currentSum += nums[r];
            if (r - l + 1 == k) {
                ans = Math.max(ans, currentSum);
            }
            r++;
        }
        return ans;
    }
}