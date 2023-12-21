/*
===================================================== 206. Reverse Linked List ======================================================


Problem Statement : Given the head of a singly linked list, reverse the list, and return the reversed list.


Examples : 

                    Example 1:
                    Input: head = [1,2,3,4,5]
                    Output: [5,4,3,2,1]


                    Example 2:
                    Input: head = [1,2]
                    Output: [2,1]


                    Example 3:
                    Input: head = []
                    Output: []

*/
public class 29 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode tmp = null;
        while(curr != null)
        {
            tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
