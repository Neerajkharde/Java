package PatternsAdv;
// Hollow Butterfly
public class pc_02 {
    public static void main(String[] args) {
        int n = 5;
        // Part1
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if (j==1||i==j) {
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (j==1||i==j) {
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
        // Part2
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                if (j==1||i==j) {
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                }
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if (j==1||i==j) {
                    System.out.print("*");
                 } else {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
