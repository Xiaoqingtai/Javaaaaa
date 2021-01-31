public static void main1(String[] args) {
    int[] array = {1,2,3,4,5,6,7,8,9};
    int[] array1 = {9,8,7,6,5,4,3,2,1};
    for(int i = 0;i < array.length;i++) {
        int tmp = array[i];
        array[i] = array1[i];
        array1[i] = tmp;
    }
}