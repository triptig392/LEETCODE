class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int org = x;
        int rev = 0;
        int max = Integer.MAX_VALUE;

        while(x != 0){
            int rem = x%10;
            rev = rev*10 + rem;
            x = x/10;
        }
        
        // if(rev > max){
        //     return false;
        // }
        if(rev == org){
            return true;
        }
        return false;
    }
}