package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchTest {
    private final String PATH = "/home/annie/repos/sort-exercise/sort-exercise/src/main/java/org/example/words.txt";

    ArrayList<String> readArray;

    @BeforeEach
    void setup() throws FileNotFoundException {
        readArray = new ArrayList<>();
        try {
            File myObj = new File(PATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                readArray.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Test
    void binarySearch_shouldBeFaster_ThanLinearSearch() {
        Timer timer1 = new Timer();
        timer1.startTimer();
        for (int i = 0; i < 10000; i++) {
            SearchAlgorithms.linearSearch(readArray, "word");
        }
        timer1.stopTimer();

        Timer timer2 = new Timer();
        timer2.startTimer();
        for (int i = 0; i < 10000; i++) {
            SearchAlgorithms.binarySearch(readArray, "word");
        }
        timer2.stopTimer();

        Assertions.assertTrue(timer1.getExecutionTime() > timer2.getExecutionTime());
    }
}
