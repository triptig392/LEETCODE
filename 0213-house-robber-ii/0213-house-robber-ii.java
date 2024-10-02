class Solution {
    public int helper(List<Integer> arr) {
        int n = arr.size();

        int prev = arr.get(0);
        int prev2 = 0;

        for(int i=1; i<n; i++){
            int take =  ((i-2)>=0) ? (arr.get(i)+prev2 ): (arr.get(i));
            int nonTake = prev;
            int curr = Math.max(take, nonTake);
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
    public int rob(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(i!=0) l1.add(nums[i]);
            if(i!=nums.length-1) l2.add(nums[i]);
        }


        return Math.max(helper(l1), helper(l2)); 
    }
}