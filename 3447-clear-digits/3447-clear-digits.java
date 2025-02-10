class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                sb.delete(sb.length()-1, sb.length());
            }else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}