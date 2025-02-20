class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] arr = new int[51];
        int[] ans = new int[n-k+1];

        for(int i=0; i<k; i++){
            if(nums[i]<0){
                arr[-nums[i]]++;
            }
        }
        int curr = 0;
        for(int i=50; i>0 ; i--){
            curr+=arr[i];
            if(curr >= x){
                ans[0] = -i;
                break;
            }
        }
        int r = k-1;
        for(int i=0; i<n-k; i++){
            if(nums[i]<0){
                arr[-nums[i]]--;
            }
            r++;
            if(nums[r]<0){
                arr[-nums[r]]++;
            }
            curr = 0;
            for(int m=50; m>0; m--){
                curr+=arr[m];
                if(curr >= x){
                    ans[i+1] = -m;
                    break;
                }
            }
        }
        return ans;
    }
}