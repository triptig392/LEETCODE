class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] ones = new int[n];

        if(s.charAt(0)==1){
            ones[0]++;
        }
        
        for(int i=1; i<n; i++){
            int a = s.charAt(i);
            if(a == '1'){
                ones[i] = ones[i-1]+1;
            }else{
                ones[i] = ones[i-1];
            }
        }

        int ans = 0;
        int zeros = 0;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == '0'){
                zeros++;
            }

            int curr = zeros+ ones[n-1] - ones[i];
            ans = Math.max(ans, curr);
        }

        return ans;
    }
}