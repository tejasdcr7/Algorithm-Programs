package com.bridgelabz.algo;

import java.util.Random;

public class BubbleSort {
    public static void main(String args[]) {

        System.out.println("Before Sorting Array : ");

        int array[] = {234, 177, 56, 458, 37, 162, 51, 77, 63};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        bubbleSort(array);
        System.out.println(" ");
        System.out.println("After Sorting Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
    public static void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
