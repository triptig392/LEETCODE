/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode merge(ListNode head1, ListNode head2){
        ListNode ans = new ListNode(-1);
        ListNode k = ans;

        while(head1 != null && head2 != null){
            if(head1.val > head2.val){
                k.next = head2;
                head2 = head2.next; 
            }else{
                k.next = head1;
                head1 = head1.next;
            }
            k = k.next;
        }

        while(head1 != null){
            k.next = head1;
            head1 = head1.next;
            k = k.next;
        }

        while(head2 != null){
            k.next = head2;
            head2 = head2.next;
            k = k.next; 
        }

        return ans.next;
    }

    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = slow;

        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }

        prev.next = null;

        ListNode l1= mergeSort(head);
        ListNode l2 =  mergeSort(slow);

        return merge(l1, l2);
    }

    public ListNode sortList(ListNode head) {
       return mergeSort(head);       
    }
}