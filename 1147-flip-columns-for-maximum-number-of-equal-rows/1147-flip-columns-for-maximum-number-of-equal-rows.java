class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String, Integer> hm = new HashMap<>();
        int ans = 0;

        for(int i=0; i<matrix.length; i++){
            String str = "";
            String inv = "";
            for(int j=0; j<matrix[0].length; j++){
                str+=matrix[i][j];
                if(matrix[i][j] == 0){
                    inv = inv+ 1; 
                }else{
                    inv = inv+0;
                }
            }
            if(hm.containsKey(str)){
                    int m = hm.get(str)+1;
                    hm.put(str,m);
                    ans = Math.max(m, ans);
                }else if(hm.containsKey(inv)){
                    int m = hm.get(inv)+1;
                    hm.put(inv, m);
                    ans = Math.max(m, ans);
                }else{
                    hm.put(str, 1);
                    ans = Math.max(ans, 1);
                }
        }
        return ans;
    }
}