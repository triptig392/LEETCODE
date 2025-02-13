class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue();
        int n = nums.length;
        for(int i=0; i<n; i++){
            pq.add((long)nums[i]);
        }
        int ans = 0;
        while(pq.peek() < k){
            long a = pq.remove(); 
            long b = pq.remove();
            pq.add(Math.min(a,b)*2+Math.max(a,b));
            ans++;
        }
        return ans;
    }
}