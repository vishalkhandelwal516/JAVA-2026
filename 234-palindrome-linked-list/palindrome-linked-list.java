class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {   
        if (head == null || head.next == null) return true;

        // finding middle node
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reversing second half

        ListNode prev, nextNode, temp;
        prev = null;
        temp = slow;
        while (temp!=null)
        {
            nextNode = temp.next;
            temp.next= prev;

            prev = temp;
            temp = nextNode;
        }
        slow = prev;

        // checking
        while(head!=null && slow!=null)
        {
            if (head.val!=slow.val)
            {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}