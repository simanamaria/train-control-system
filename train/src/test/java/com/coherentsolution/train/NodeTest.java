package com.coherentsolution.train;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NodeTest {
    /**
     * Method under test: {@link Node#Node()}
     */
    @Test
    public void testConstructor() {
        Node<Object> actualNode = new Node<>();
        assertNull(actualNode.data);
        assertNull(actualNode.next);
    }

    /**
     * Method under test: {@link Node#Node(Object)}
     */
    @Test
    public void testConstructor2() {
        Node<Object> actualNode = new Node<>("Data");
        assertEquals("Data", actualNode.data);
        assertNull(actualNode.next);
    }
}

