class Solution {
    public int[] canSeePersonsCount(int[] heights) {
    Stack<Integer> mono = new Stack();
    for (int i = heights.length - 1; i >= 0; --i) {
        int h = heights[i], cnt = 0;
        for (; !mono.isEmpty() && mono.peek() < h; ++cnt)
            mono.pop();
        heights[i] = cnt + (mono.isEmpty() ? 0 : 1);
        mono.push(h);
    }
    return heights;        
}
}