class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        int ans = 0;
        int n =  nums.length;

        while( i<n && j<n){
            while(j<n && nums[j]-nums[i] < k){
                j++;
            }
            if(j!=i && j<n && i < n && nums[j]-nums[i] == k){
                ans++;
                int curr = nums[i];
                while(i<n && nums[i]==curr){
                    i++;
                }
                j = i;
            }else{
                i++;
            }
        }
        return ans;
    }
}