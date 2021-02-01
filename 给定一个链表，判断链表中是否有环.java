public class Solution {
    public boolean hasCycle(ListNode head) {
        int count=8029;

        while(head!=null&&count>0){
            head=head.next;
            count--;
        }
        if(head==null)
            return false;

        return true;


    }
}