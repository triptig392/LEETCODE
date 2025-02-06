class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        int swap = 0;
        int swapIdx = -1;
        int swapIdx2 = -1;

        for(int i=0; i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                swap++;
                if(swap > 2){
                return false;
            }
                if(swap == 1){
                    swapIdx = i;
                }
                if(swap == 2){
                    swapIdx2 = i;
                }
            }
        }

        if(swapIdx == -1 && swapIdx2 == -1){
            return true;
        }

        if(swapIdx2 == -1 && swapIdx != -1){
            return false;
        }

        if(s1.charAt(swapIdx) != s2.charAt(swapIdx2) || 
        s1.charAt(swapIdx2) != s2.charAt(swapIdx)){
            return false;
        }

        return true;
    }
}