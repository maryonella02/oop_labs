package com.lab2;

public class MainQueue {
    public static void main(String[] args) {
        Queue unlimitedQueue = new Queue();
        Queue limitedQueue = new Queue(3);
        unlimitedQueue.push("first");
        unlimitedQueue.push("second");
        unlimitedQueue.push("third");
        System.out.println("Popped element " + unlimitedQueue.pop());

        limitedQueue.push("first");
        limitedQueue.push("second");
        limitedQueue.push("third");
        System.out.println("Is full " + limitedQueue.isFull());
        System.out.println("Is unlimited full " + unlimitedQueue.isFull());
        System.out.println("Operation status  " + limitedQueue.push("unsucess"));
        Queue empty = new Queue();
        System.out.println("Is empty queue empty? " + empty.isEmpty());

    }
}
