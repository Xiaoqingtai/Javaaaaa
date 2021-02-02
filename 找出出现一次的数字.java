public class Main {
    public static int findNum(int[] array) {
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {1,1,2,3,3,4,4,5,5};
        System.out.println(findNum(array));
    }
}