class Solution {
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        while(headA != null && headB != null) {
            if(headA.val > headB.val) {
                tmp.next = headB;
                headB = headB.next;
            }else{
                tmp.next = headA;
                headA = headA.next;
            }
            tmp = tmp.next;
        }
        //代码走到这里肯定是一个为空 一个不为空
        if(headA != null) {
            tmp.next = headA;
        }
        if(headB != null) {
            tmp.next = headB;
        }
        return newHead.next;
    }
}