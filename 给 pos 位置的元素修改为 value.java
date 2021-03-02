public void setPos(int pos, int value) {
        if(pos < 0 || pos >= this.usedSize) {
        return;
        }
        this.elem[pos] = value;
        }