class Solution {
    public boolean isCircularSentence(String sentence) {
        boolean ans = true;

        String[] s = sentence.split(" ");

        int n = s.length;
        if(s[0].charAt(0) != s[n-1].charAt(s[n-1].length()-1)){
            ans = false;
        }

        for(int i=0; i<n-1; i++){
            if(s[i].charAt(s[i].length()-1) != s[i+1].charAt(0)){
                ans = false;
            }
        }
        return ans;
    }
}