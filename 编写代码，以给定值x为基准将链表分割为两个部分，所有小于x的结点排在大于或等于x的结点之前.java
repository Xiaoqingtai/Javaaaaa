public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead==null) return null;
        ListNode bs = null;
        ListNode be = null;
        ListNode as = null;
        ListNode ae = null;
        ListNode cur = pHead;
        while(cur != null) {
            if(cur.val < x) {
                if(bs == null) {
                    //说明一个节点还没有的情况下
                    bs = cur;
                    be = cur;
                }else {
                    //说明已经有了节点
                    be.next = cur;
                    be = be.next;
                }
            }else{
                if(as == null) {
                    //第2个段 第一次插入
                    as = cur;
                    ae = cur;
                }else{
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(bs == null) {
            //说明第一个段里面没有数据
            return as;
        }
        be.next = as;

        if(as != null) {
            //说明最后一段肯定有数据
            ae.next = null;
        }
        return bs;
    }
}