// Fibonacci Series

public class Code_03 {
    public static void fibSeri(int a, int b, int n) {
        // Base Case
        if(n == 0){
            return;
        }
        int c = a + b; // Formula for Fibonacci Series
        System.out.println(c);
        fibSeri(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 8;
        fibSeri(a, b, n-2);
    }
}
