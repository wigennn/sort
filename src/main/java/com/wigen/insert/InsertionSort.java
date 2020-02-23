package com.wigen.insert;

/**
 * 后一个与前面排好的数组比
 */
public class InsertionSort {

    public static void insert(int[] arr, int n) {
        int key = arr[n];
        int i = n;
        while (arr[i -1] > key) {
            arr[i] = arr[i - 1];
            i--;
            if (i == 0) break;
        }
        arr[i] = key;
    }

    public static void insertSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            insert(arr, i);
        }
    }

    public static void main(String[] args) {

        int[] arr = {9,3,1,2,8,4,6,5};
        insertSort(arr, 8);

        for (int i = 0; i < 8; i++) {
            System.out.println(arr[i]);
        }
    }
}
