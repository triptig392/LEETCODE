class LRUCache {
    private final Map<Integer, Integer> map;
    private final int capacity;

    public LRUCache(int capacity) {
        map = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = map.get(key);
        if (value == null) {
            return -1;
        }
        updateEntry(map, key, value);

        return value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            updateEntry(map, key, value);
            return;
        }
        if (map.size() < capacity) {
            map.put(key, value);
            return;
        }

        for (var oldEntry : map.entrySet()) {
            map.remove(oldEntry.getKey());
            put(key, value);
            break;
        }
    }

    private static void updateEntry(Map<Integer, Integer> map, Integer key, Integer value) {
        map.remove(key);
        map.put(key, value);
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */