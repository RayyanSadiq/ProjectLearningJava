package com.Droid7X.JavaAdvanced.CollectionsFramework.SetAndQueueInterfaces;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(); // syntax for making an arrayDeque
        // what this is used for is a standard queue with other options to access the queue from the back and front.

        queue.add("s"); // adds to the front of the queue
        queue.add("c");
        queue.add("w");
        queue.offer("3"); // adds to the back of the queue
        System.out.println(queue);

        System.out.println(queue.peek()); // returns a value at the front of the queue, if nothing is there then returns
        System.out.println(queue.element()); // null, that's not the case for the element() method is that will throw an
        // error instead.

        System.out.println(queue.remove()); // removes elements form a queue, but will throw an error if nothing is there
        System.out.println(queue.poll()); //  poll() does the same but it returns null instead.
    }
}
