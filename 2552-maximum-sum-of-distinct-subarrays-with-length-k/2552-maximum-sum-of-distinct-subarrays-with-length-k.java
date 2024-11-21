class Solution {

    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0;
        long currentSum = 0;
        int l = 0;
        int r = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        while (r < nums.length) {
            int currNum = nums[r];
            int lastOccurrence = hm.getOrDefault(currNum, -1);
            // if current window already has number or if window is too big, adjust window
            while (l <= lastOccurrence || r - l + 1 > k) {
                currentSum -= nums[l];
                hm.put(nums[l], hm.getOrDefault(nums[l], 1)-1);
                if((hm.get(nums[l]))==0){
                    hm.remove(nums[l]);
                }
                l++;
            }
            hm.put(currNum, r);
            currentSum += nums[r];
            if (r - l + 1 == k) {
                ans = Math.max(ans, currentSum);
            }
            r++;
        }
        return ans;
    }
}