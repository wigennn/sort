package com.wigen.bubble;

/**
 * 两两排序
 */
public class BubbleSort {

    /**
     * 一次冒泡: 两两排序 共n-1次
     */
    public static void bubble(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }

    /**
     * 排序多少次
     */
    public static void bubbleSort(int arr[], int len) {
        for (int i = len; i > 1; i--) {
            bubble(arr, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 123, 4, 5, 1, 5, 6, 2};

        bubbleSort(arr, 8);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
