class Solution {
    public boolean canBeDone(int[] nums, int k, int mid){
        int curr = 1;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>mid){
                return false;
            }
            if(sum+nums[i] <= mid){
                sum += nums[i];
            }else{
                curr++;
                sum=nums[i];
            }
        }
        return (curr<=k);
    }
    public int splitArray(int[] nums, int k) {
        int si = 0;
        int ei = (int)1e9;
        int ans = ei;

        while(si<=ei){
            int mid = si+ (ei-si)/2;
            if(canBeDone(nums, k, mid)){
                ans = mid;
                ei = mid-1;
            }else{
                si = mid+1;
            }
        }
        return ans;
    }
}