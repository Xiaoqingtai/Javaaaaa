public boolean chkPalindrome() {
    if(this.head == null) return false;
    // write code here
    // 1、找到当前链表的中间位置
    Node fast = this.head;
    Node slow = this.head;
    while (fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
    }
    //2、从中间位置开始，后半部分进行翻转
    Node cur = slow.next;
    while (cur != null) {
        Node curNext = cur.next;
        cur.next = slow;
        slow = cur;
        cur = curNext;
    }
    //3、head从头往后走   slow从后往前走
    // 只要发现 对应的val值不一样 就返回false  直到head和slow相遇
    while(head != slow) {
        if(head.val != slow.val) {
            return false;
        }
        //偶数的情况
        if(head.next == slow) {
            return true;
        }
        head = head.next;
        slow = slow.next;
    }
    return true;
}