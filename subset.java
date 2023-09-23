package RecursionAdv;

import java.util.ArrayList;

public class subset {
    public static void printList (ArrayList<Integer> subset) {
        for(int i=0; i<subset.size(); i++) {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void printSubset(int n, ArrayList<Integer> subset) {
        if( n == 0 ) {
            printList(subset);
            return;
        }
        // Add
        subset.add(n);
        printSubset(n-1, subset);

        // Not Add
        subset.remove(subset.size()-1);
        printSubset(n-1, subset);
    }
    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubset(n, subset);
    }
}
