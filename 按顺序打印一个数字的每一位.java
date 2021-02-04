public static void printf(int n) {
        if(n > 9){
        printf(n/10);
        }
        System.out.println(n%10);
        }
public static void main(String[] args) {
        printf(1234);
        }