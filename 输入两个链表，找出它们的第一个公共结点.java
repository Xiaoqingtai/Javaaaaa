public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        int lenA = 0;
        int lenB = 0;
        ListNode pl = headA;//永远指向最长的链表
        ListNode ps = headB;//永远指向最短的链表
        while(pl != null) {
            pl = pl.next;
            lenA++;
        }
        while(ps != null) {
            ps = ps.next;
            lenB++;
        }
        pl = headA;
        ps = headB;//一定要指回来
        int len = lenA - lenB;
        if(len < 0) {
            pl = headB;
            ps = headA;
            len = lenB-lenA;
        }
        //我肯定是pl是最长的那个链表 ps是最短的那个链表
        while(len != 0) {
            pl = pl.next;
            len--;
        }

        while(pl != ps) {
            pl = pl.next;
            ps = ps.next;
        }
        //pl == ps
        return pl;
    }
}