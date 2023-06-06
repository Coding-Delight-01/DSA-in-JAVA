import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array by setting the position of the pivot value
            int pivotIndex = partition(arr, low, high);

            // Recursively sort the left and right parts of the array
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        // Select the pivot element
        int pivot = arr[high];

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the greater element found at i
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
