class Solution {

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // Map to store frequency of each pattern
        Map<String, Integer> hm = new HashMap<>();
        int maxFrequency = 0;

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
            String rowPattern = sb.toString();
            hm.put(rowPattern, hm.getOrDefault(rowPattern, 0) + 1);

            int freq = hm.get(rowPattern);
            maxFrequency = Math.max(freq, maxFrequency);
        }

        // Find the pattern with maximum frequency
        return maxFrequency;
    }
}