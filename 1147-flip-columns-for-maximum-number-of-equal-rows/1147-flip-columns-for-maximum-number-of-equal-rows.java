class Solution {

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        // Map to store frequency of each pattern
        Map<String, Integer> patternFrequency = new HashMap<>();
        int maxFrequency = 0;

        for (int[] currentRow : matrix) {
            StringBuilder patternBuilder = new StringBuilder("");

            // Convert row to pattern relative to its first element
            for (int col = 0; col < currentRow.length; col++) {
                // 'T' if current element matches first element, 'F' otherwise
                if (currentRow[0] == currentRow[col]) {
                    patternBuilder.append("T");
                } else {
                    patternBuilder.append("F");
                }
            }

            // Convert pattern to string and update its frequency in map
            String rowPattern = patternBuilder.toString();
            patternFrequency.put(rowPattern, patternFrequency.getOrDefault(rowPattern, 0) + 1);

            int freq = patternFrequency.get(rowPattern);
            maxFrequency = Math.max(freq, maxFrequency);
        }

        // Find the pattern with maximum frequency
        return maxFrequency;
    }
}