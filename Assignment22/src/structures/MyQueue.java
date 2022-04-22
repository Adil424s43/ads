package structures;

import java.util.ArrayList;

public class MyQueue<T> {
    private ArrayList<T> myQueue;
    // index of in front element
    private int front;
    // index of element in rear
    private int rear;

    public MyQueue() {
        myQueue = new ArrayList<>();
        front = -1;
        rear = -1;
    }

    public ArrayList<T> getMyQueue() {
        return myQueue;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public void enqueue(T item) {
        if (myQueue.isEmpty()) {
            front++;
            rear++;
            myQueue.add(item);
        } else {
            front++;

            if (myQueue.size() > front) {
                myQueue.set(front, item);
            } else {
                myQueue.add(item);
            }
        }
    }

    public void dequeue() {
        if (myQueue.isEmpty()) {
            System.out.println("There is no elements");
            throw new IllegalCallerException();
        } else if (front != rear) {
            rear++;
        } else {
            front = -1;
            rear = -1;
        }
    }

    public T front() {
        if (front == -1) {
            System.out.println("There is no elements in front");
            return null;
        }

        return myQueue.get(front);
    }

    public T rear() {
        if (rear == -1) {
            System.out.println("There is no elements in rear");
            return null;
        }

        return myQueue.get(rear);
    }

    public void print() {
        if (myQueue.isEmpty()) {
            System.out.println("Empty queue, no elements");
        } else {
            for (int i = rear; i < front; i++) {
                System.out.print(myQueue.get(i) + " ");
            }

            System.out.print(myQueue.get(front));
            System.out.println();
        }
    }
}
