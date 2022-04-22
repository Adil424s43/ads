package structures;

import java.util.ArrayList;

public class MyHeap<T extends Comparable<T>> {
    private ArrayList<T> myHeap;

    public MyHeap() {
        myHeap = new ArrayList<>();
    }

    public ArrayList<T> getMyHeap() {
        return myHeap;
    }

    public void add(T item) {
        myHeap.add(myHeap.size(), item);
        heapify(myHeap.size() - 1);
    }

    public T removeRoot() {
        T temporary = myHeap.get(1);
        myHeap.set(1, myHeap.get(myHeap.size() - 1));
        heapify(1);

        return temporary;
    }

    private void heapify(int index) {
        T temp = myHeap.get(index);

        while (temp.compareTo(myHeap.get(index / 2)) > 0) {
            myHeap.add(index, myHeap.get(index / 2));
            index = index / 2;
        }

        myHeap.add(index, temp);
    }

}
