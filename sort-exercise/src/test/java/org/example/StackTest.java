package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    SimpleList.Stack stack;

    @BeforeEach
    void setup() {
        stack = new SimpleList.Stack(4);
    }

    @Test
    void should_PushNumbers() {
        stack.push(10);
        stack.push(20);

        Assertions.assertEquals(20 , stack.peek());
    }

    @Test
    void should_PushAndPopNumbers() {
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.push(20);

        Assertions.assertEquals(stack.peek(), 20);
    }

    @Test
    void should_throwException_whenStackIsFull() {
        pushToReachMaxSize();
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> stack.push(50));

    }

    @Test
    void should_throwException_whenStackIsEmpty() {
        Assertions.assertThrows(IndexOutOfBoundsException.class,
                () -> stack.pop());
    }

    void pushToReachMaxSize() {
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
    }
}
