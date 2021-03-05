public ListNode FindKthToTail(ListNode head,int k){
    if(hesd == null || k <= 0){
        ListNode fast = head;
        ListNode slow = head;
        while( k-1 != 0){
            //每次走之前判断fast是否已经走到尾节点
           if(fast.next != null){
               fast = fast.next;
               k--;
           }else{
               return null;
           }//代表k值过大
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}