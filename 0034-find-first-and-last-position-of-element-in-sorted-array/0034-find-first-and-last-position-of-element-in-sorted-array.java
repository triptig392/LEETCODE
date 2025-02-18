class Solution {
    public int searchFirst(int[] nums, int target){
        int idx = -1;
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = (si+ei)/2;

            if(nums[mid] == target){
                idx = mid;
                ei = mid-1;
            }
            else if(nums[mid] < target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return idx;
    }

    public int searchLast(int[] nums, int target){
        int idx = -1;
        int si = 0;
        int ei = nums.length-1;

        while(si<=ei){
            int mid = (si+ei)/2;

            if(nums[mid] == target){
                idx = mid;
                si = mid+1;
            }
            else if(nums[mid] < target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{searchFirst(nums, target), searchLast(nums, target)};
    }
}