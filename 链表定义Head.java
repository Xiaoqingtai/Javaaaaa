public class MyLinkedList {

    public Node head;//表示当前链表的头 默认是null

    /**
     *
     */
    public void createLinked() {
        this.head = new Node(12);
        Node node2 = new Node(22);
        Node node3 = new Node(32);
        Node node4 = new Node(42);
        this.head.next = node2;
        node2.next = node3;
        node3.next = node4;
    }
}
