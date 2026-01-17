/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VSubmission;

/**
 *
 * @author user
 */
public class OptimizedInsertionSort {

    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void display(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 2, 9};
        insertionSort(arr);
        display(arr);
    }
    
}
