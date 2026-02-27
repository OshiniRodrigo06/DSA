package VISubmission;

public class OptimizedQuickSort {

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];        // pivot is on the LEFT
        int x = low + 1;             // x starts just after pivot (moves right)
        int y = high;                // y starts at the end (moves left)

        while (true) {
            // x moves right while values are less than pivot
            while (x <= y && arr[x] < pivot) {
                x++;
            }
            // y moves left while values are greater than pivot
            while (y >= x && arr[y] > pivot) {
                y--;
            }
            // if pointers crossed, stop
            if (x >= y) break;

            // swap unsatisfying values at x and y
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;

            x++;
            y--;
        }

        // place pivot in correct position (swap pivot with y)
        int temp = arr[low];
        arr[low] = arr[y];
        arr[y] = temp;

        return y;   // return pivot's final position
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);   // left of pivot
            quickSort(arr, pi + 1, high);  // right of pivot
        }
    }

    static void display(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 9, 13, 57, 25, 17, 1, 90, 3};  // same as your diagram!
        quickSort(arr, 0, arr.length - 1);
        display(arr);
    }
}
