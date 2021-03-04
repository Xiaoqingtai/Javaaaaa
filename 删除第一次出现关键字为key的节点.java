/**
 * 找到关键key的前驱，如果有返回前驱节点的引用
 * 如果没有返回null
 * @param key
 * @return
 */
public Node searchPrev(int key) {
        Node cur = this.head;

        while (cur.next != null) {
        if(cur.next.val == key) {
        return cur;
        }
        cur = cur.next;
        }
        return null;//代表没有要删除的key值的前驱
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