package RecursionAdv;

public class Party {
    public static int callGuest(int n) {
        // Base Case
        if( n <= 1 ) {
            return 1;
        }
        // Single
        int way1 =callGuest(n-1);
        // Pairs
        int way2 = (n-1)*callGuest(n-2);
        return way1+way2;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Total Ways to invite people = "+callGuest(n));
    }
}
