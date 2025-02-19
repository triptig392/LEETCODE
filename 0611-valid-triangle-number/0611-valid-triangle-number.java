class Solution {
    public int triangleNumber(int[] nums) {
        
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;

        for(int c=n-1; c>1; c--){
            int j = c-1;

            for(int i=0; i<j; i++){
                
                while(j>i && nums[i]+nums[j] > nums[c]){
                    j--;
                    ans+=j-i+1;
                }
                
            }
        }
        return ans;
    }
}