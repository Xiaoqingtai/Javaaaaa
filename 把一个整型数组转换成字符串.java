public static String toString(int[] arr) {
    String ret = "\"";
    ret += "[";
    for (int i = 0; i < arr.length; i++) {
        if (i < arr.length - 1) {
            ret += arr[i] + ",";
        } else if (i == arr.length - 1) {
            ret += arr[i] + "]";
        }
    }
    ret += "\",";
    return ret;
}
public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    String s = toString(arr);
    System.out.println(s);
}