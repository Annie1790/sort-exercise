package org.example;

public class SimpleList {
    public static class LinkedList {
        Node head;

        private static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        public int getHeadData() {
            return this.head.data;
        }

        public void insert(int data) {
            Node newInt = new Node(data);

            if (this.head == null) {
                this.head = newInt;
            } else {
                Node last = this.head;

                while (last.next != null) {
                    last = last.next;
                }

                last.next = newInt;
            }
        }

        public void printList() {
            Node currentNode = this.head;
            System.out.print("LinkedList: ");

            while (currentNode != null) {
                System.out.print(this.head.data + " ");
                currentNode = currentNode.next;
            }
        }
    }

        //Fixed size
        public static class Stack {
            private final int[] stack;
            private int topNum;
            private final int maxSize;

            Stack(int maxSize) {
                topNum = -1;
                this.maxSize = maxSize;
                stack = new int[maxSize];
            }

            void push(int numberToPush) {
                if (isFull()) {
                    throw new IndexOutOfBoundsException("Stack is full. Cannot push");
                } else {
                    stack[++topNum] = numberToPush;
                }
            }

            void pop() {
                if (!isEmpty()) {
                    stack[topNum] = 0;
                    topNum -= 1;
                } else {
                    throw new IndexOutOfBoundsException("Stack is empty. Cannot pop");
                }
            }

            int peek() {
                if (!isEmpty()) {
                    return stack[topNum];
                } else {
                    throw new IndexOutOfBoundsException("Stack is empty. Cannot pop");
                }
            }

            private boolean isFull() {
                return topNum == maxSize - 1;
            }

            private boolean isEmpty() {
                return topNum == -1;
            }
        }
    }