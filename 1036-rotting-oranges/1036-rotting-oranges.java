class Solution {
    public void bfs(int[][] arr, int r, int c, int d){
        if(r>= arr.length || c >=arr[0].length || r <0 || c <0 || arr[r][c] == 0 ){
            return;
        }

        if(arr[r][c] >= d || arr[r][c] == 1){
            arr[r][c] = d;
            bfs(arr, r+1, c, d+1);
            bfs(arr,r, c+1, d+1);
            bfs(arr,r-1, c, d+1);
            bfs(arr,r, c-1, d+1);
        }
    }
    public int orangesRotting(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 2){
                    bfs(arr, i, j, 2);
                }
            }
        }
        int ans = 2;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 1){
                    return -1;
                }
                ans = Math.max(arr[i][j], ans);
            }
        }
        return ans-2;
    }
}