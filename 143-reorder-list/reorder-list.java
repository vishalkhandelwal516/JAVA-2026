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
    public void reorderList(ListNode head) 
    {
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        } // finding the middle nodes
        
        ListNode second = slow.next;
        slow.next=null; // breaking list into half

        // now reversing the second half:

        ListNode prevNode,nextNode, temp;
        prevNode=null;
        temp = second;
        while (temp!=null)
        {
            nextNode = temp.next;
            temp.next = prevNode;

            prevNode = temp;
            temp= nextNode;
        } // at last prevNode becomes head

        // merging both now: 
        ListNode first = head;
        ListNode rev = prevNode;   // head of reversed second half

        while (rev != null) {
            ListNode n1 = first.next;   // save next nodes before relinking
            ListNode n2 = rev.next;

            first.next = rev;           // L0 -> Ln
            rev.next = n1;              // Ln -> L1

            first = n1; //shifting to next
            rev = n2;
        }

    }
}