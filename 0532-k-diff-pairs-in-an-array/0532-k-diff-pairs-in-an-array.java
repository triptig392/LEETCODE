class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int ans = 0;
        int n =  nums.length;

        while( i<n && j <n){
            if(j!=i  && nums[j]-nums[i] == k){
                ans++;
                while(j<n-1 && nums[j]==nums[j+1]){
                    j++;
                }
                j++;
            }else if (nums[j] - nums[i] > k){
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }
}