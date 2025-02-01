class Solution {
    public void bfsUtil(int[][] graph, boolean[] vis, int curr){
        vis[curr] = true;
        for(int i=0; i<vis.length; i++){
            if(graph[curr][i] == 1){
                if(!vis[i]){
                    bfsUtil(graph, vis, i);
                }
            }
        }
    }
    public int bfs(int[][] graph, boolean[] vis){
        int ans = 0;
        for(int i=0; i<vis.length; i++){
            if(!vis[i]){
                ans++;
                bfsUtil(graph, vis, i);
            }
        }
        return ans;
    }

    public int findCircleNum(int[][] graph) {
        boolean[] vis = new boolean[graph.length];
        return bfs(graph, vis);
    }
}