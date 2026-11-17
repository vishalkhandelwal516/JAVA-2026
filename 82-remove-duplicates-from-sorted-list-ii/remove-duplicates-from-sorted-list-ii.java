class Solution 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode dummy = new ListNode();
        ListNode dummyTemp = dummy;
        ListNode temp = head;
        while (temp!=null)
        {
            if(temp.next == null || temp.val != temp.next.val) 
            {
                dummyTemp.next = temp;
                temp=temp.next;
                dummyTemp = dummyTemp.next;
                
            }
            else 
            {
                int v = temp.val;
                while(temp != null && temp.val == v)
                {
                    temp= temp.next;
                }
            }
        }

        dummyTemp.next = null;
        return dummy.next;
    }
}