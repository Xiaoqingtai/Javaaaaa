public void addLast(int data) {
        //0、new
        Node node = new Node(data);
        if(this.head == null) {
        this.head = node;
        }else {
        //1、cur 找尾巴
        Node cur = this.head;
        while (cur.next != null) {
        cur = cur.next;
        }
        //2、插入
        cur.next = node;
        }