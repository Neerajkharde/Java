package RecursionAdv;

public class Permutations {
    public static void printPerm(String str, String Perm) {
        //Base Case
        if (str.length() == 0) {
            System.out.println(Perm);
            return;
        }
        for(int i =0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, Perm + currChar);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPerm(str, "");
    }
}
