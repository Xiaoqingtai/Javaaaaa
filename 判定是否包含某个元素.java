public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
        if(this.elem[i] == toFind) {
        return true;
        }
        }
        return false;
        }