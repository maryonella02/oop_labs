package com.lab2;

public class MainQueue {
    public static void main(String[] args) {
        Queue unlimitedQueue = new Queue();
        Queue limitedQueue = new Queue(3);
        unlimitedQueue.push("first");
        unlimitedQueue.push("second");
        unlimitedQueue.push("third");
        System.out.println("Popped element: " + unlimitedQueue.pop());

        limitedQueue.push("first");
        limitedQueue.push("second");
        limitedQueue.push("third");
        System.out.println("Is limited queue full? " + limitedQueue.isFull());
        System.out.println("Is unlimited queue full? " + unlimitedQueue.isFull());
        System.out.println("Operation status for pushing in full limited queue one more element: " + limitedQueue.push("four"));
        Queue empty = new Queue();
        System.out.println("Is queue empty? " + empty.isEmpty());

    }
}
