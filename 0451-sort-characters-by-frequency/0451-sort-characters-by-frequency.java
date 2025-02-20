class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        List<Character> li = new ArrayList<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            int a = hm.getOrDefault(s.charAt(i),0);
            hm.put(s.charAt(i), a+1);
            li.add(s.charAt(i));
        }

        li.sort((a, b)->{
            if((int)hm.get(a) == (int)hm.get(b)){
                return (int)a-(int)b;
            }
            return (int)hm.get(b)-(int)hm.get(a);
        });
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<li.size(); i++){
            sb.append(li.get(i));
        }

        return sb.toString();
    }
}