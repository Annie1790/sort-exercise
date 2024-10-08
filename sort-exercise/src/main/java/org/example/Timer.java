package org.example;

public class Timer {

    long startTime;
    long endTime;

    public Timer() {
        startTime = 0;
        endTime = 0;
    }

    public void startTimer() {
        startTime = System.nanoTime();
    }

    public void stopTimer() {
        endTime = System.nanoTime();
    }

    public long getExecutionTime() {
        return endTime - startTime;
    }

    public void printExecutionTime() {
        System.out.println(String.format("Total execution time: %s", (endTime - startTime)));
    }
}
