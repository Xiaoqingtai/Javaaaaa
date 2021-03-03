public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
        if(cur.val == key) {
        return true;
        }
        cur = cur.next;
        }
        return false;
        }