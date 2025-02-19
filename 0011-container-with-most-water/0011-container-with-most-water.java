class Solution {
    public int maxArea(int[] nums) {
        int ans = 0;
        int i = 0;
        int j = nums.length-1;

        while(i<j){
            int curr = (j-i)*Math.min(nums[i], nums[j]);
            ans = Math.max(curr, ans);
            if(nums[i]<nums[j]){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}