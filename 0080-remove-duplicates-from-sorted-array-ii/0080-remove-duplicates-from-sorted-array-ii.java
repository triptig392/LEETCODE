class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int dupli = 1;

        for(int i=1; i<nums.length;i++){
            if(dupli == 1 && nums[i]==nums[k]){
                k++;
                nums[k]=nums[i];
                dupli++;
            }
            else if(nums[i]!=nums[k]){
                k++;
                nums[k]=nums[i];
                dupli=1;
            }else if(nums[i]==nums[k]){
                dupli++;
            }
        }
        return k+1;
    }
}