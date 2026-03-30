package sorting.basics;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 3, 4, 2, 5};

        System.out.print("Before Sorting: ");
        printArray(arr);

        insertionSort(arr);

        System.out.print("\nAfter Sorting: ");
        printArray(arr);
    }

    private static void insertionSort(int[] arr) {
        int key = 0;
        int size = arr.length;
        int j = 0;

        for (int i = 1; i < size; i++) {
            key = arr[i];
            j = i - 1;

            while ( j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
            printArray(arr);
        }
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
