class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        int[] arr = new int[k];
        int t  = 0;
        for(int x = n-k; x<n; x++){
            arr[t] = nums[x];
            t++;
        }

        int i = n-k-1;
        int j = n-1;
        while(i>=0){
            nums[j] = nums[i];
            i--;
            j--;
        }

        for(int x = 0;x<arr.length; x++){
            nums[x] = arr[x];
        }
    }
}