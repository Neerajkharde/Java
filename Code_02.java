// Factorial

public class Code_02 {
    public static int calcFact(int n) {
        if(n ==1 || n==0){
            return 1;
        }
        int fac_nm1 = calcFact(n-1);
        int fact_n = n * fac_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        int fact = calcFact(4);
        System.out.println(fact);
    }
}
