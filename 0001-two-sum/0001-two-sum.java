class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            int needed = target-nums[i];
            if(hm.containsKey(needed)){
                return new int[]{hm.get(needed), i};
            }else{
                hm.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}