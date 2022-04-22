package application;

import structures.MyHeap;
import structures.MyQueue;
import structures.MyStack;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Queue:");
        queue.print();

        queue.dequeue();
        queue.dequeue();

        System.out.println("Queue elements after 2 dequeue calls: ");
        queue.print();

        MyStack<Integer> stack = new MyStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack:");
        stack.print();

        System.out.println("peek() = " + stack.peek());
        System.out.println("Calling pop ...");
        stack.pop();
        System.out.println("peek() after pop(): " + stack.peek());
        System.out.println();


        MyHeap<Integer> myHeap = new MyHeap<>();

        myHeap.add(12);
        myHeap.add(16);
        myHeap.add(19);
        myHeap.add(56);

        myHeap.removeRoot();

        System.out.println();
    }
}
