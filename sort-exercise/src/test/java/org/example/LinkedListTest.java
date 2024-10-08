package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    SimpleList.LinkedList linkedList;

    @BeforeEach
    void setup() {
        linkedList = new SimpleList.LinkedList();
    }

    @Test
    void should_addNodesToLinkedList() {
        linkedList.insert(10);
        linkedList.insert(20);

        Assertions.assertEquals(10, linkedList.getHeadData());
    }
}
