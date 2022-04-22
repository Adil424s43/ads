package structures;

import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> myStack;

    // index of last element
    private int index;

    public MyStack() {
        myStack = new ArrayList<>();
        index = -1;
    }

    public ArrayList<T> getMyStack() {
        return myStack;
    }

    public int getIndex() {
        return index;
    }


    public void push(T item) {
        myStack.add(item);
        index += 1;
    }

    public void pop() {
        if (!myStack.isEmpty()) {
            myStack.remove(index);
            index--;
        } else {
            System.out.println("You cannot call pop() on empty stack!");
            throw new IllegalCallerException();
        }
    }

    public T peek() {
        if (!myStack.isEmpty()) {
            return myStack.get(index);
        } else {
            System.out.println("You cannot call peek() on empty stack!");
            throw new IllegalCallerException();
        }
    }

    public void print() {
        if (!myStack.isEmpty()) {
            for (T item : myStack) {
                System.out.print(item + " ");
            }
            System.out.println();
        } else {
            System.out.println("Empty stack, no elements!");
        }
    }
}
