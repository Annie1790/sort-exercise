package org.example;

public class InsertionSort {
    public static int[] sort(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int leftUnsortedNum = array[i];
            int j = i - 1;

            while ( j >= 0 && array[j] > leftUnsortedNum) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = leftUnsortedNum;
        }
        return array;
    }

}