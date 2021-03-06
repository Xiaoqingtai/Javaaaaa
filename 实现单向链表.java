class Node {
    public int val;
    public Node next;
    public Node() {

    }
    public Node(int val) {
        this.val = val;
    }
}
    //头插法
    public void addFirst(int data) {
        //0、首先你得有个节点
        Node node = new Node(data);
        //1、判断链表是不是空的
        if(this.head == null) {
            this.head = node;
        }else {
            //2、插入
            node.next = this.head;
            this.head = node;
        }
        //0、首先你得有个节点
       /* Node node = new Node(data);
        //1、判断链表是不是空的
        node.next = this.head;
        this.head = node;*/
    }
    //尾插法
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
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index < 0 || index > size()) {
            System.out.println("index不合法");
            return;
        }
        //头插法
        if(index == 0) {
            addFirst(data);
            return;
        }
        //尾插法
        if(index == size()) {
            addLast(data);
            return;
        }
        Node cur = moveIndex(index);
        //cur保存的是 index-1位置的节点的引用
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
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
    public void remove(int key) {
        if(this.head == null) {
            return;
        }
        if(this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        //正常的进行删除
        Node prev = searchPrev(key);
        if(prev == null) {
            System.out.println("没有这个key的前驱");
        }else {
            Node del = prev.next;
            prev.next = del.next;
        }
    }
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
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;//2
            cur = cur.next;
        }
        return count;
    }
    public void display(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print (cur.val +" ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear() {
        this.head = null;
    }