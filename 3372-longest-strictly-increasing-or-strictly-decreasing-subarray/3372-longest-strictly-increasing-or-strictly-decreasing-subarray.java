class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int inc = 1;
        int dec = 1;
        int curInc = 1;
        int curDec = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                curInc++;
                curDec = 1;
                inc = Math.max(inc, curInc);
            }else if(arr[i]<arr[i-1]){
                curDec++;
                curInc = 1;
                dec = Math.max(dec, curDec);
            }else{
                curInc = 1;
                curDec = 1;
            }
        }
        return Math.max(inc, dec);
    }
}