public void add(int pos, int data) {
    //顺序表是否满
    if(isFull()) {
        //System.out.println("顺序表为满！");
      resize();
    }
    //pos是否合法
    if(pos < 0 || pos > this.usedSize) {
        System.out.println("pos位置不合法！");
        return;
    }
    //移动元素
    for (int i = this.usedSize-1; i >= pos  ; i--) {
        this.elem[i+1] = this.elem[i];
    }
    this.elem[pos] = data;
    this.usedSize++;
}