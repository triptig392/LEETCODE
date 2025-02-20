class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n= s.length();
        int m = p.length();
        List<Integer> ans = new ArrayList<>();
        if(m>n){
            return ans;
        }
        int[] arr = new int[26];
        int[] prr = new int[26];

        int tot = 0;

        for(int i=0; i<m; i++){
            int idx = p.charAt(i)-'a';
            if(prr[idx]==0){
                tot++;
            }
            prr[idx]++;
        }
        int req = 0;

        for(int i=0; i<m; i++){
            int idx = s.charAt(i)-'a';
            arr[idx]++;
            if(arr[idx]==prr[idx]){
                req++;
            }
        }

        if(req == tot){
            ans.add(0);
        }
        
        int r = m-1;
        for(int i=0; i<n-m; i++){
            arr[s.charAt(i)-'a']--;
            if(arr[s.charAt(i)-'a'] == (prr[s.charAt(i)-'a']-1)){
                req--;
            }
            r++;
            arr[s.charAt(r)-'a']++;
            if(arr[s.charAt(r)-'a'] == prr[s.charAt(r)-'a']){
                req++;
            }
            if(req == tot){
                ans.add(i+1);
            }
        }
        return ans;

    }
}