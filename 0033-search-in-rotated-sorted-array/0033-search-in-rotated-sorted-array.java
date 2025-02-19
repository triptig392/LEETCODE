class Solution {
    public int getPivot(int[] nums){
        int si = 0;
        int ei = nums.length -1;
        int ans = 0;

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(nums[0]<=nums[mid]){   // yh equal isliye beacuse {7, 1, 2, 3, 5}
                ans= mid;
                si = mid+1;
            }else{
                ei = mid -1;
            }
        }
        return ans;
    }
    public int search(int[] nums, int target) {
        int maxIndex = getPivot(nums);
        int l,r;
        if(nums[0]<=target && target<=nums[maxIndex]){
            l = 0;
            r = maxIndex;
        } else{
            l = maxIndex + 1;
            r = nums.length-1;
        }
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]>target){
                r = mid-1;
            } else{
                l = mid+1;
            }
        }
        return -1;
    }
}