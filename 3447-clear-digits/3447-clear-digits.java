class Solution {
    public String clearDigits(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                s.push(str.charAt(i));
            }else{
                if(!s.isEmpty()){
                    s.pop();
                }
            }
        }

        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.reverse().toString();
    }
}