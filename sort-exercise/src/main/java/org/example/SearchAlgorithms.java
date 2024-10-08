package org.example;

import java.util.ArrayList;

public class SearchAlgorithms {

    public static String linearSearch(ArrayList<String> array, String expected) {
        for (String s : array) {
            if (s.compareTo(expected) == 0) {
                return s;
            }
        }
        return "not found";
    }

    public static String binarySearch(ArrayList<String> array, String expected) {
        int low = 0;
        int high = array.size() - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            String middleIndexWord = array.get(middleIndex);

            if (middleIndexWord.compareTo(expected) == 0) {
                return middleIndexWord;
            }

            if (middleIndexWord.compareTo(expected) < 0) {
                high =- 1;
            }

            if (middleIndexWord.compareTo(expected) > 0) {
                low =+ 1;
            }
        }
        return "not found";
    }
}
