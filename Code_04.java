// Print x^n -> Stack Height = log n

public class Code_04 {
    public static int calcPower(int x, int n) {
        // Base Case 1
        if(x == 0){
            return 0;
        }
        // Base Case 2
        if(n == 0){
            return 1;
        }
        // Main Code
        if(n % 2 == 0){ // n is even
            return calcPower(x, n/2) * calcPower(x, n/2);
        }
        else{// n is odd
            return calcPower(x, n/2) * calcPower(x, n/2) * x ;
        }
    }
    public static void main(String[] args) {
       int ans = calcPower(2, 10);
       System.out.println(ans);
    }
}
