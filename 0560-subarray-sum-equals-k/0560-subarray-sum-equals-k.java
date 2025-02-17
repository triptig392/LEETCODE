class Solution {
    public int subarraySum(int[] nums, int target) {
        Map<Integer,Integer>hm = new HashMap<>();
        int ans = 0, sum = 0;
        //hm.put(0, 1);
        for(int i=0; i<nums.length; i++){
            sum = sum+nums[i];
            if(sum == target){
                ans++;
            }
            int remaining = sum - target;
            if(hm.containsKey(remaining)){
                ans = hm.get(remaining) + ans;
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
}