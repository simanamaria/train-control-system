package com.coherentsolutions.train;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NodeTest {

    @Test
    public void testConstructor() {
        Node<Object> actualNode = new Node<>();
        assertNull(actualNode.data);
        assertNull(actualNode.next);
    }

    @Test
    public void testConstructor2() {
        Node<Object> actualNode = new Node<>("Data");
        assertEquals("Data", actualNode.data);
        assertNull(actualNode.next);
    }
}

