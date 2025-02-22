/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        // Create a copy for each node of original list
        Node curr = head;
        while(curr!=null){
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = curr.next.next;
        }
        // fix random pointer
        curr = head;
        while(curr!=null){
            curr.next.random = curr.random == null ? null : curr.random.next;
            curr = curr.next.next;
        }
 
        Node copyHead = head.next;
        // fix next pointer
        curr = head;
        while(curr!=null){
            Node originalNext = curr.next.next;
            Node copyNode = curr.next;
            copyNode.next = originalNext==null ? null: originalNext.next;
 
            curr.next = originalNext;
            curr = originalNext;
        }
 
        return copyHead;
 
    }
}