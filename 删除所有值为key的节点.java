public void removeAllKey(int key){
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
        if(cur.val == key) {
        prev.next = cur.next;
        }else {
        prev = cur;
        }
        cur = cur.next;
        }
        if(this.head.val == key) {
        this.head = this.head.next;
        }
        }