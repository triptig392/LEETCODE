class Solution {
    public String removeOccurrences(String s, String part) {

        while(s != ""){
            if(s.contains(part)){
                int idx = s.indexOf(part);
                s = s.substring(0, idx)+ s.substring(idx+part.length());
            }else{
                return s;
            }
        }
        return s;
    }
}