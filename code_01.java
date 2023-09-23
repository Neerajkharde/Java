// Sum of first n natural numbers

public class code_01 {
    public static void calcSum(int i, int n, int sum) {
       //Base Case
       if(i == n){
        sum += i;
        System.out.println(sum);
        return;
       }
        sum += i;
       calcSum(i+1, n, sum);
    }
    public static void main(String[] args) {
      calcSum(1, 5, 0);
    }
}
