class Solution {
    public void dfs(int[][] arr, int sr, int sc, int color, int initial, int[] r, int[] c){
        if(initial == color){
            return;
        }
        arr[sr][sc]= color;

        for(int i=0; i<4; i++){
            int row = sr+r[i];
            int col = sc+c[i];
            if(row >=0 && row < arr.length && col >=0 && col < arr[0].length ){
                if(arr[row][col] == initial ){
                    dfs(arr, row, col, color, initial, r, c);
                }
            }
        }
    }

    public int[][] floodFill(int[][] arr, int sr, int sc, int color) {
        int initial = arr[sr][sc];
        int[] r = {-1, 0, +1, 0};
        int[] c = {0, +1, 0, -1};
        dfs(arr, sr, sc, color, initial, r, c);
        System.gc();
        return arr;
    }
}