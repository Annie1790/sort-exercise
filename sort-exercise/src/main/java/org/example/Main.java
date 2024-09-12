package org.example;

import java.util.Random;
import java.util.stream.IntStream;
/*
Measure the time taken to sort arrays of two different lengths (e.g. 10000 and 20000 integers) to observe the performance difference.
	•	Time 60 mins
	•	Create a Github repository for your Java Project.
	•	Implement the selection sort algorithm first and create basic test cases.
	•	Run the tests and ensure the algorithm works correctly.
	•	Conduct a few timed tests and document your findings.
Once completed move onto a different sorting algorithm Merge or Insertion Sort.
 */
public class Main {

    public static void main(String[] args) {
        //with 10.000 random numbers between 0-100
        int[] myArray = IntStream.generate(() -> new Random().nextInt(10000)).limit(100).toArray();
        Timer timer = new Timer();

        timer.startTimer();
        SelectionSort.sort(myArray);
        timer.endTimer();
        timer.printExecutionTime();
    }
}