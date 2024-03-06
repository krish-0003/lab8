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



}
