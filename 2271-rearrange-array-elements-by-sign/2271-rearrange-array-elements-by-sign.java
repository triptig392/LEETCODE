class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int si = 0;

        for(int i=0; i<ans.length; i=i+2){
            while(nums[si] < 0){
                si++;
            }
            ans[i] = nums[si];
            si++;
        }

         si = 0;

        for(int i=1; i<ans.length; i=i+2){
            while(nums[si] > 0){
                si++;
            }
            ans[i] = nums[si];
            si++;
        }

        return ans;
    }
}