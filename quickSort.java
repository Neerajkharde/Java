package SortingMnQ;

public class quickSort {
    public static int partition(int[] arr, int low, int high) {
        // Declaring our pivot
        int pivot = arr[high];
        // i makes place for elements less than our pivot !
        int i = low-1;// Here low = 0;

        for(int j=low; j<high; j++) {
            // Comparison
            if(arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Make a place for our pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i; // Pivot cha index !
    }

    public static void quicksort(int[] arr, int low, int high) {
        if(low < high) {
            int pidx = partition(arr, low, high);
            quicksort(arr, low, pidx-1);
            quicksort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quicksort(arr, 0, n-1);
        // Printing the Sorted Array

        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+ " ");
        }System.out.println();
        
    }
}
