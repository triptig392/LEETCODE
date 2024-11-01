class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        char c = s.charAt(0);
        int rep = 1;

        for(int i=1; i<s.length(); i++){
            if(c == s.charAt(i)){
                rep++;
            }else{
                rep = 1;
                c = s.charAt(i);
            }

            if(rep <= 2){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}