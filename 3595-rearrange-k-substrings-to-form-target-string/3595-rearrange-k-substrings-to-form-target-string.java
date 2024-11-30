class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();

        int bp = s.length()/k;

        for(int i=0; i<k; i++){
            l1.add(s.substring(i*bp, (i+1)*bp));
            l2.add(t.substring(i*bp, (i+1)*bp));
        }

        Collections.sort(l1);
        Collections.sort(l2);

        for(int i=0; i<l1.size(); i++){
            if(!l1.get(i).equals(l2.get(i))){
                return false;
            }
        }

        
        return true;
    }
}