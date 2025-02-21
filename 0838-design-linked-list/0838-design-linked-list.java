

class ListNode {
    int val;
    ListNode next, prev;

    ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    private ListNode head, tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode(val);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode(val);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(val);
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        ListNode node = new ListNode(val);
        ListNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }
        node.next = curr.next;
        node.prev = curr;
        curr.next.prev = node;
        curr.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (index == size - 1) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            ListNode curr = head;
            for (int i = 0; i < index; i++) curr = curr.next;
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
        size--;
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