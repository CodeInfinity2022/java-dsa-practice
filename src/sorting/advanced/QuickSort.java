package sorting.advanced;

/**
 * 
 * Pseudo Code:
 * 1. Choose a pivot (commonly the last element)
 * 2. Partition the array:
 *    - Place pivot in its correct sorted position
 *    - Ensure elements left of pivot are smaller
 *    - Ensure elements right of pivot are greater
 * 3. Recursively apply QuickSort to:
 *    - Left subarray (low to pivotIndex - 1)
 *    - Right subarray (pivotIndex + 1 to high)
 * 4. Base Case:
 *    - Stop recursion when low >= high
 *
 * Time Complexity:
 * - Best Case: O(n log n)
 * - Average Case: O(n log n)
 * - Worst Case: O(n^2)  (when pivot is always smallest/largest)
 *
 * Space Complexity:
 * - Average: O(log n)   (recursion stack)
 * - Worst: O(n)
 * 
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 3, 4, 2, 5};     

        System.out.print("Before Sorting: ");
        printArray(arr);

        quickSort(arr, 0, arr.length-1);

        System.out.print("\nAfter Sorting: ");
        printArray(arr);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1 );
            quickSort(arr, pi + 1, high);
        } 
    }

    private static int partition(int[] arr, int low, int high) {
        int i = low - 1;

        int pivot = arr[high];

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }            
        }
        swap(arr, i+1, high);

        return i+1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for(int num: arr) {
            System.out.print(num + "  ");
        }
    }
}
