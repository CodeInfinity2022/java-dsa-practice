package sorting.basics;

/**
 * Psuedo Code:
 *  1.  2 Nested Loop
 *  2.  Loop through array
 *  3.  Compare adjacent element - largest element moves to the end
 *  4.  Swap in inner loop
 * 
 * Time Complexity:     O(n^2)
 * 
 * Space Complexity:    O(1)
 **/
public class BubbleSort {
    public static void main (String[] args) {
        int[] arr = {8, 6, 3, 4, 2, 5};

        System.out.print("Before Sorting: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("\nAfter Sorting: ");
        printArray(arr);
        
    }

    public static void bubbleSort (int[] arr) {
        int size = arr.length;
        int temp = 0;
        boolean swapped;

        for(int i = 0; i < size; i++) {
            swapped = false;
            for (int j = 0; j < size - i -1; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
                    
            }

            //  Optimization - if no swapping => Sorted
            if(!swapped)    break;
            printArray(arr);

        }

    }

    public static void printArray (int[] arr) {
        System.out.println();
        for(int num: arr) {
            System.out.print(num + "  ");
        }
    }
    
}
