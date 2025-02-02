class Solution {
    public void dfs(int[][] arr, int sr, int sc, int color, int initial){
        if(initial == color){
            return;
        }

        if(sr >= 0 && sr <arr.length && sc >=0 && sc < arr[0].length && arr[sr][sc] == initial){
            arr[sr][sc]= color;

            dfs(arr, sr-1, sc, color, initial);
            dfs(arr, sr, sc+1, color, initial);
            dfs(arr, sr+1, sc, color, initial);
            dfs(arr, sr, sc-1, color, initial);
        }
    }

    public int[][] floodFill(int[][] arr, int sr, int sc, int color) {
        int initial = arr[sr][sc];
        dfs(arr, sr, sc, color, initial);
        return arr;
    }
}