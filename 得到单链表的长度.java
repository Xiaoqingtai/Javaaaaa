public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
        count++;//2
        cur = cur.next;
        }
        return count;
        }
