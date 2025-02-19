class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int ans = 0;
        int n = s.length();
        int l = 0;
        int r = 0;
        int cur = 0;

        while(r<n && l <n ){
            char c = s.charAt(r);
            if(!hm.containsKey(c)){
                cur++;
                ans = Math.max(cur, ans);
                hm.put(c, 1);
                r++;
            }else{
                while(hm.containsKey(c)){
                    cur--;
                    hm.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return ans;
    }
}