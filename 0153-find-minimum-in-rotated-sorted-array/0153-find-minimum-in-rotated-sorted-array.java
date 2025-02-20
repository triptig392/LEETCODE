class Solution {
    public int getPivot(int[] nums){
        int si = 0;
        int ei = nums.length -1;
        int ans = 0;

        while(si<=ei){
            int mid = si+(ei-si)/2;
            if(nums[0]<=nums[mid]){   // yh equal isliye beacuse {7, 1, 2, 3, 5} agar 
            //yh nhi likhna equal
            // toh hume initialize 0 s krna pdega ab hum -1 s bhi kr skte h
                ans= mid;
                si = mid+1;
            }else{
                ei = mid -1;
            }
        }
        return ans;
    }
    public int findMin(int[] nums) {
         int maxIndex = getPivot(nums);
         if(maxIndex == nums.length-1){
            return nums[0];
         }
         return nums[maxIndex+1];
    }
}