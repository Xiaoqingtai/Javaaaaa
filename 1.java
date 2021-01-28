private static void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
    }
}
public static void main(String[] args) {
    int[] arr = {2, 5, 3, 6, 4, 7,};
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
}