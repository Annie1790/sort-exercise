package org.example;

public class SelectionSort {

    public static int[] sort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            int currentIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[currentIndex]) {
                    currentIndex = j;
                }
            }
            int swap = array[currentIndex];
            array[currentIndex] = array[i];
            array[i] = swap;
        }
        return array;
    }


}
