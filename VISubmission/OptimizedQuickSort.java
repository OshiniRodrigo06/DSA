/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISubmission;

/**
 *
 * @author user
 */
public class OptimizedQuickSort {

    static int partition(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        int pivot = arr[mid];

        // Move pivot to end
        int temp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = temp;

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void display(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {7, 2, 1, 6, 8, 5, 3, 4};
        quickSort(arr, 0, arr.length - 1);
        display(arr);
    }
    
}
