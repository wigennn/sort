package com.wigen.selection;

/**
 * 先找到最大值, 然后放最后一个
 */
public class SelectionSort {

    /**
     * 找到最大值下标
     */
    public static int findMaxPos(int arr[], int n) {
        int max = arr[0];
        int pos = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
                pos = i;
            }
        }

        return pos;
    }

    /**
     * 与最后一个替换
     */
    public static void selectionSort(int arr[], int n) {
        while (n > 1) {
            int pos = findMaxPos(arr, n);
            int temp = arr[pos];
            arr[pos] = arr[n - 1];
            arr[n - 1] = temp;
            n--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,7,9,4,6,3,1};
        selectionSort(arr, 7);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
