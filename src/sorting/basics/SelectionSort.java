package sorting.basics;

/**
 * Psuedo Code:
 *  1.  2 Nested Loop
 *  2.  Assume current index is minimum
 *  3.  Scan through Array  - find the smallest
 *  4.  Inner Loop - Find smallest
 *  5.  Outer Loop - Swap smallest with current index
 * 
 * Time Complexity: O(n^2)
 * 
 * Space Complexity: O(1)
 * 
 */

public class SelectionSort {
    public static void main (String[] args) {
        int[] arr = {8, 5, 3, 4, 2, 6};

        System.out.print("Before Sorting: ");
        printArray(arr);

        selectionSort(arr);

        System.out.print("\nAfter Sorting: ");
        printArray(arr);
        
    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;
        int minIndex = -1;
        int temp = 0;

        for(int i = 0; i < size-1; i++) {
            minIndex = i;
            for(int j = i + 1; j < size; j++) {
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }

            //Optimization - swap index only if required
            if(minIndex != i) {
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                printArray(arr);
            }
            
            
        }

    }

    public static void printArray (int[] arr) {
        System.out.println();
        for(int num: arr) {
            System.out.print(num + "  ");
        }
    }
}
