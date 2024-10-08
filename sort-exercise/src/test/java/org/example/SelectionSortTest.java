package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class SelectionSortTest {

    int[] smallArray;
    int[] myArray1;
    int[] myArray2;
    Timer timer;

    @BeforeEach
    void setup() {
        //generates arrays with 10k and 20k numbers between 0 and 100
        smallArray = new int[]{18, 5, 2, 173, 1};
        myArray1 = IntStream.generate(() -> new Random().nextInt(100)).limit(10000).toArray();
        myArray2 = IntStream.generate(() -> new Random().nextInt(100)).limit(20000).toArray();
        timer = new Timer();
    }

    @Test
    void shouldBeFirstIndexZero_WhenArrayIsSorted() {
        SelectionSort.sort(smallArray);
        Assertions.assertEquals(1, smallArray[0]);
    }

    @Test
    void shouldBeLastIndex173_WhenArrayIsSorted() {
        int size = smallArray.length - 1;
        SelectionSort.sort(smallArray);
        Assertions.assertEquals(173, smallArray[size]);
    }

    @Test
    void sortFirstArray() {
        timer.startTimer();
        SelectionSort.sort(myArray1);
        timer.stopTimer();

        Assertions.assertNotEquals(timer.getExecutionTime(), 0L);
    }

    @Test
    void sortSecondArray() {
        timer.startTimer();
        SelectionSort.sort(myArray2);
        timer.stopTimer();

        Assertions.assertNotEquals(timer.getExecutionTime(), 0L);
    }

    @Test
    void shouldReturnTrue_WhenFirstArrayTimerIsLessThanSecondArray() {
        Timer timerForTenK = new Timer();
        Timer timerForTwentyK = new Timer();

        timerForTenK.startTimer();
        SelectionSort.sort(myArray1);
        timerForTenK.stopTimer();
        timerForTenK.printExecutionTime();

        timerForTwentyK.startTimer();
        SelectionSort.sort(myArray2);
        timerForTwentyK.stopTimer();
        timerForTwentyK.printExecutionTime();

        Assertions.assertTrue((timerForTenK.getExecutionTime()) < (timerForTwentyK.getExecutionTime()));
    }
}
