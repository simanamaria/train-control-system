package com.coherentsolution.train;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;

public class TrainLinkedListTest {

    @Test
    public void testAddHead() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.addHead("42");
        assertEquals(1, trainLinkedList.getLength());
        assertEquals("42", trainLinkedList.head.next.data);
    }

    @Test
    public void testAddHead2() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(0, "42");
        trainLinkedList.addHead("42");
        assertEquals(2, trainLinkedList.getLength());
        assertEquals("42", trainLinkedList.head.next.data);
    }

    @Test
    public void testAddTail() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.addTail("42");
        assertEquals(1, trainLinkedList.getLength());
        assertEquals("42", trainLinkedList.head.next.data);
    }

    @Test
    public void testAddTail2() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(0, "42");
        trainLinkedList.addTail("42");
        assertEquals(2, trainLinkedList.getLength());
        Node node = trainLinkedList.head.next;
        assertSame(node.data, node.next.data);
    }

    @Test
    public void testInsert() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(1, "42");
        assertEquals(1, trainLinkedList.getId());
        assertEquals(0, trainLinkedList.getLength());
    }

    @Test
    public void testInsert2() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(0, "42");
        assertEquals(1, trainLinkedList.getLength());
        assertEquals("42", trainLinkedList.head.next.data);
    }

    @Test
    public void testInsert3() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(0, "42");
        trainLinkedList.insert(1, "42");
        assertEquals(2, trainLinkedList.getLength());
        Node node = trainLinkedList.head.next;
        assertSame(node.data, node.next.data);
    }

    @Test
    public void testInsert4() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(-1, "42");
        assertEquals(1, trainLinkedList.getId());
        assertEquals(0, trainLinkedList.getLength());
    }

    @Test
    public void testDelete() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        assertFalse(trainLinkedList.delete(new Node()));
    }

    @Test
    public void testDelete2() {
        assertFalse((new TrainLinkedList<>(1)).delete(null));
    }

    @Test
    public void testGetLength() {
        assertEquals(0, (new TrainLinkedList<>(1)).getLength());
    }

    @Test
    public void testGetLength2() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(0, "42");
        assertEquals(1, trainLinkedList.getLength());
    }

    @Test
    public void testPrint() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.print();
        assertEquals(1, trainLinkedList.getId());
        assertEquals(0, trainLinkedList.getLength());
    }

    @Test
    public void testPrint2() {
        TrainLinkedList<Object> trainLinkedList = new TrainLinkedList<>(1);
        trainLinkedList.insert(0, "42");
        trainLinkedList.print();
        assertEquals(1, trainLinkedList.getId());
    }

    @Test
    public void testConstructor() {
        TrainLinkedList<Object> actualTrainLinkedList = new TrainLinkedList<>(1);
        actualTrainLinkedList.setId(1);
        assertEquals(1, actualTrainLinkedList.getId());
    }

    @Test
    public void testConstructor2() {
        TrainLinkedList<Object> actualTrainLinkedList = new TrainLinkedList<>(1);
        assertEquals(1, actualTrainLinkedList.getId());
        assertEquals(0, actualTrainLinkedList.getLength());
        assertNull(actualTrainLinkedList.head.data);
    }
}

