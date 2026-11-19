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
class Solution 
{
    public ListNode swapPairs(ListNode head) 
    {
   ListNode dummy = new ListNode(0, head);
    ListNode prev = dummy;
    while (prev.next != null && prev.next.next != null) {
        ListNode first = prev.next, second = first.next;
        first.next = second.next; // first will be the back: it links to the rest
        second.next = first;      // second turns round to face first
        prev.next = second;       // the node before the pair now leads to second
        prev = first;             // first is now the back of the pair
    }
    return dummy.next;
    }
}