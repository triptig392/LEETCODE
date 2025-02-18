class Solution {
    public int searchFirst(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;
        int ans =-1; 

        while(si<=ei){
            int mid = (si+ei)/2;
            if(nums[mid]==target){
                ei = mid-1;
                ans = mid;
            }else if(nums[mid]>target){
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }
    public int searchLast(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;
        int ans =-1; 

        while(si<=ei){
            int mid = (si+ei)/2;
            if(nums[mid]==target){
                si = mid+1;
                ans = mid;
            }else if(nums[mid]<target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchFirst(nums, target), searchLast(nums, target)};
    }
}