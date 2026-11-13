/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}\
 \

 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode list3 = new ListNode();
        ListNode temp = list3; // at start temp is null.
        while(list1!=null && list2!=null)
        {
            // loop jab tak chalega jab tak dono list null nhi hai.
            if (list1.val<=list2.val)
            {
                temp.next=list1; // created link.
                list1=list1.next; 
            } else
            {
                temp.next=list2; // created link.
                list2=list2.next;
            }
            temp = temp.next;
            // this while loops stops at list1= null leaving list2 at 4.
        } 

        if (list1 != null) 
        {
            temp.next = list1; /* jo last mei bach jate hai vo element yahan se add ho jate hai */
        } else 
        {
            temp.next = list2; // this executes the last leftover element now.
        }

        return list3.next;
    }
}