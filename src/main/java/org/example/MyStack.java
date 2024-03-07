package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E>  {
    private ArrayList<E> delegate;

    // Constructor initializes the delegate ArrayList
    public MyStack() {
        this.delegate = new ArrayList<>();
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        // Retrieve the top element from the stack
        E e = delegate.get(delegate.size() - 1);
        // Remove the top element from the stack
        delegate.remove(delegate.size() - 1);
        return e;

    }
   // Method to check if the stack is empty
    public boolean isEmpty() {
        return delegate.isEmpty();
    }
    // Method to get the size of the stack
    public int size() {
        return delegate.size();
    }


}
