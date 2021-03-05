public Node reverseList3() {
        Node cur = this.head;
        Node prev = null;
        while (cur != null) {
        Node curNext = cur.next;
        cur.next = prev;
        prev = cur;
        cur = curNext;
        }
        return prev;
        }