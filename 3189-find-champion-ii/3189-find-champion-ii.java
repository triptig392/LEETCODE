class Solution {
    public int findChampion(int n, int[][] edges) {

        if(n== 1 ){
            return 0; 
        }

        int[][] arr = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i][1] = i;
        }

        for(int[] edge: edges){
            arr[edge[1]][0]--;
        }

        Arrays.sort(arr, (a, b)-> a[0]-b[0]);
        
        if( arr[n-1][0] != arr[n-2][0] ){
            return arr[n-1][1];
        }

        return -1;
    }
}