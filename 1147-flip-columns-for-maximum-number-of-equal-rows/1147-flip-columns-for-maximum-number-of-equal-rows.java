class Solution {

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // Map to store frequency of each pattern
        Map<String, Integer> hm = new HashMap<>();
        int ans = 0;

        for (int[] currentRow : matrix) {
            StringBuilder sb = new StringBuilder("");

            // Convert row to pattern relative to its first element
            for (int col = 0; col < currentRow.length; col++) {
                // 'T' if current element matches first element, 'F' otherwise
                if (currentRow[0] == currentRow[col]) {
                    sb.append("T");
                } else {
                    sb.append("F");
                }
            }

            // Convert pattern to string and update its frequency in map
            String str = sb.toString();
            int freq = hm.getOrDefault(str, 0) + 1;
            hm.put(str, freq);
            ans = Math.max(freq, ans);
        }

        // Find the pattern with maximum frequency
        return ans;
    }
}