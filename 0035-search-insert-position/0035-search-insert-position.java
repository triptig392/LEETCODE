class Solution {
    public int searchInsert(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        int ans = ei+1;

        while(si<=ei){
            int mid = (si+ei) /2;
            if(nums[mid]>=target){
                ans = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }
}