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