import java.util.*;
class Solution {
    public int tupleSameProduct(int[] nums) {
        Map <Integer, Integer> hm = new HashMap<>();

        int ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                int curr = nums[i]*nums[j];
                hm.put(curr, hm.getOrDefault(curr, 0)+1);
                if(hm.get(curr) > 1){
                    ans += 8*(hm.get(curr)-1);
                }
            }
        }
        return ans;
    }
}