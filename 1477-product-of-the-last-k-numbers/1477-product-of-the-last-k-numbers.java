class ProductOfNumbers {
    List<Integer> list;
    int idx;
    int lastZero;
    public ProductOfNumbers() {
        this.list = new ArrayList<>();
        this.idx = 0;
        this.list.add(1);
        this.lastZero = 0;
    }
    
    public void add(int num) {
        idx++;
        if(num != 0) {
            list.add(list.get(list.size() - 1) * num);
        } else {
            lastZero = idx;
            list.add(1);
        }
    }
    
    public int getProduct(int k) {
        if(lastZero <= idx - k) {
            return list.get(list.size() - 1) / list.get(idx - k);
        } else return 0; // x x 0 [3 4 5]
    }
}