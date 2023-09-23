package RecursionAdv;

public class placeTiles {
    public static int Placement(int n, int m) {
        // Base Case
        if(n == m){
            return 2;
        }
        if(n < m) {
            return 1;
        }
        // Vertically
        int vertPlacements = Placement(n-m, m);
        // Horizontally
        int horPlacements = Placement(n-1, m);

        return vertPlacements + horPlacements;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        int totalPlacements = Placement(n, m);
        System.out.println("Total Ways = "+totalPlacements);
    }
}
