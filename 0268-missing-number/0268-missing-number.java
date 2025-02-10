class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = (n*(n+1))/2;
        int current = 0;

        for(int i=0; i<n; i++){
            current += nums[i];
        }

        return expected-current;
    }
}