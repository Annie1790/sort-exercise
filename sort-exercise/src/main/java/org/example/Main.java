package org.example;

import java.io.*;

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

    public static void main(String[] args) throws IOException {
        final String PATH = "/home/annie/repos/sort-exercise/sort-exercise/src/main/java/org/example/words.txt";
//        with 10.000 random numbers between 0-100
//        int[] myArray = IntStream.generate(() -> new Random().nextInt(10000)).limit(100).toArray();
//        Timer timer = new Timer();
//
//        timer.startTimer();
//        SelectionSort.sort(myArray);
//        timer.stopTimer();
//        timer.printExecutionTime();
//        ArrayList<String> array = new ArrayList<>();
//
//        try {
//            File myObj = new File(PATH);
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                array.add(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//        Timer timer1 = new Timer();
//        timer1.startTimer();
//        for (int i = 0; i < 10000; i++) {
//            SearchAlgorithms.linearSearch(array, "word");
//        }
//        timer1.stopTimer();
//
//        Timer timer2 = new Timer();
//        timer2.startTimer();
//        for (int i = 0; i < 10000; i++) {
//            SearchAlgorithms.binarySearch(array, "word");
//        }
//        timer2.stopTimer();
//
//        timer1.printExecutionTime();
//        timer2.printExecutionTime();
    }
}