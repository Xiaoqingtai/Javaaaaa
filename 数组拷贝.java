public static int[] copyOf(int []arr) {
    int[] arr2=new int[arr.length];
    for(int i=0;i<arr.length;i++) {
        arr2[i] = arr[i];
    }
    return arr2;
}
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int[] newarr = copyOf(arr);
    System.out.println(Arrays.toString(newarr));
}