public static void bubbleSort(int[] array) {
    boolean flg = false;
        //i 趟数
    for (int i = 0; i < array.length-1; i++) {
        flg = false;
        for(int j = 0; j < array.length-1-i;j++) {
            if(array[j]  > array[j+1]) {
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
                flg = true;
            }
        }
        if(flg == false) {
            return;
        }
    }
}