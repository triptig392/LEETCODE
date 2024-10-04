class Solution {
    public long dividePlayers(int[] arr) {
        long ans = 0;
        int n = arr.length;
        Arrays.sort(arr);

        int l = 0;
        int r = n-1;
        int sum = arr[l]+arr[r];

        while(l<r){
            int a =arr[l];
            int b = arr[r];
            if(a+b != sum){
                return -1;
            }
            ans += a*b;
            l++;
            r--;
        }

        return ans;
    }
}