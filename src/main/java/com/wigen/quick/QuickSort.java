package com.wigen.quick;

/**
 * 1.以第一个值为pivot
 * 2.high-- 找到比pivot小的值，交换low high值
 * 3.low++ 找到比pivot大的值，交换 low high 值
 * 4.left < high 循环
 * 5.最终left会大于等于high 交换pivot值
 */
public class QuickSort {

    static int partition(int[] arr, int low, int high) {
        int pivotKey = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivotKey) {
                --high;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivotKey) {
                ++low;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivotKey;
        return low;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotLoc = partition(arr, low, high);
            quickSort(arr, low, pivotLoc - 1);
            quickSort(arr, pivotLoc + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,4, 9, 3, 1, 2, 8, 5, 6, 7};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(arr);
    }
}
