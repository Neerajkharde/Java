package SortingMnQ;

public class mergeSort {
    public static void conquer(int[] arr, int si, int mid, int ei) {

        int[] merged = new int[ei-si+1];
        int idx1 = si; // Sorted 1
        int idx2 = mid+1; // Sorted 2
        int x = 0; // To track merged array

        //Sorting begins
        while(idx1<=mid && idx2<=ei){ // Bothe arrays exist
            //Comparison
            if(arr[idx1]<=arr[idx2]) {
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }
        //Only Sorted 1 exists
        while(idx1<=mid) {
            merged[x++] = arr[idx1++];
        }
        //Only Sorted 2 exists
        while(idx2<=ei) {
            merged[x++] = arr[idx2++];
        }
        //Copy merged array to the Original Array
        for(int i=0, j=si; i<merged.length; i++,j++) { // -> i for Merged & j for Original
            arr[j] = merged[i];
        }
    }

    public static void divide(int[]arr, int si, int ei) {
        //Base Case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        // Part1
        divide(arr, si, mid);
        //Part2
        divide(arr, mid+1, ei);
        // Divide ends; Lets conquer
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int [] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        System.out.print("Unsorted Array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        divide(arr, 0, n-1);
        //Printing the Sorted array
        System.out.print("Sorted Array: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
