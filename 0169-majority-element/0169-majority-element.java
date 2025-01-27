class Solution {
    public int majorityElement(int[] nums) {
        //moore voting algorithm

        int elem = nums[0];
        int count = 1;

        for(int i=1; i<nums.length; i++){
            if(elem == nums[i]){
                count++;
            }
            if(elem != nums[i]){
                count--;
            }
             if(i<nums.length-1 && count == 0){
                elem = nums[i+1];
            }
        }

        return elem;
    }
}