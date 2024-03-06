package org.example;
import org.junit.Test;

import java.util.EmptyStackException;
import java.util.Optional;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThrows;

public class MyStackTest {

    @Test
    public void testPush() {
        MyStack<Integer> stack = new MyStack<>();

        // pushing elements onto the stack
        stack.push(1);
        stack.push(2);


        // Assert that the size of the stack is 2 after pushing elements
        assertEquals(2, stack.size());
    }

    @Test
    public void testPop() {
        MyStack<Integer> stack = new MyStack<>();

        // popping elements from an empty stack should throw EmptyStackException
        assertThrows(EmptyStackException.class, stack::pop);

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // popping elements from the stack
        assertEquals(Optional.of(3), stack.pop());
        assertEquals(Optional.of(2), stack.pop());
        assertEquals(Optional.of(1), stack.pop());

        // Assert that the size of the stack is 0 after popping all elements
        assertEquals(0, stack.size());
    }




}
