public void remove(int key) {
        //1、查找是否有2  index
        int index = search(key);
        if(index == -1) {
        System.out.println("没有啊！老铁");
        return;
        }
        //2、i = index     i <   usdSize-1
        for(int i = index;i < this.usedSize-1;i++) {
        this.elem[i] = this.elem[i+1];
        }
        //3、this.usedSize--;
        this.usedSize--;
        }