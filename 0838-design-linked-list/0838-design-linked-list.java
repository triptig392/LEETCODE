class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val; 
            this.next = null;
        }
    }
    static int n;
    static Node head;
    public MyLinkedList() {
        n = 0;
        head = null;
    }
    
    public int get(int idx) {
        if(idx >= n || idx < 0){
            return -1;
        }
        Node temp = head;
        for(int i=0; i<idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        n++;
        newNode.next = head;
        head = newNode;
    }
    
    public void addAtTail(int val) {
        if(head == null){
            addAtHead(val);
            return;
        }
        n++;
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }
    
    public void addAtIndex(int idx, int val) {
        if(idx > n || idx < 0){
            return;
        }
        if(idx == 0){
            addAtHead(val);
            return;
        }
         n++;
        Node temp = head;
        for(int i=1; i<idx; i++ ){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void deleteAtIndex(int idx) {
        if(idx >= n || idx < 0){
            return;
        }
        n--;
        if(idx == 0){
            head = head.next;
            return;
        }
        
        Node temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */