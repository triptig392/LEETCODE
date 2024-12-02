class Solution {
    public int isPrefixOfWord(String str, String searchWord) {
        String[] s = str.split(" ");
        int n = s.length;
        for(int i=0; i<s.length; i++){
            if(s[i].startsWith(searchWord)){
                return i+1;
            }
        }

        return -1;
    }
}