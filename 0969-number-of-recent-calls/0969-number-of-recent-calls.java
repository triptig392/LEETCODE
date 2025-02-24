class RecentCounter {
    Queue<Integer>  q = new LinkedList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        q.add(t);
        int req = t-3000;
        while(!q.isEmpty() && q.peek() < req){
            q.remove();
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */