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

    //O(n*k^2)   == yh n*k isliye nhi because we will be traversing all lists many times ------ pehle first fir second ..... fir first+second and third 
    public ListNode merge(ListNode head1, ListNode head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        ListNode ans = new ListNode(-1);
        ListNode k = ans;

        while(head1 != null && head2 != null){
            if(head1.val >= head2.val){
                k.next = head2;
                head2 = head2.next; 
            }else{
                k.next = head1;
                head1 = head1.next;
            }
            k = k.next;
        }

        if(head1!=null) k.next = head1;
        if(head2!=null) k.next = head2;
        return ans.next;
    }

    public ListNode mergeKs(ListNode[] lists, int n, ListNode ans){
        if(n == lists.length){
            return ans;
        }

        ans = merge(ans, lists[n]);
        return mergeKs(lists, n+1, ans);
        
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        ans = mergeKs(lists, 0, ans);
        return ans;
    }
}