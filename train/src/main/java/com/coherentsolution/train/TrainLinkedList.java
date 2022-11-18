package com.coherentsolution.train;
import java.io.*;

public class TrainLinkedList<E>{
    Node head = new Node();
    private int id;

    public TrainLinkedList(int id) {
        this.id = id;
    }

    public void addHead(E e){
        Node node = new Node(e);
        if(head.next != null){
            node.next = head.next;
        }
        head.next = node;
    }

    public void addTail(E e){
        Node node = new Node(e);
        Node pointer = head;
        while(pointer.next != null){
            pointer = pointer.next;
        }
        pointer.next = node;
    }

    public void insert(int i, E e){
        int index = 0;
        if(i >= 0 && i <= this.getLength()){
            Node node = head;
            while(index != i){
                node = node.next;
                index++;
            }
            Node element = new Node(e);
            element.next = node.next;
            node.next = element;
        }
    }

    public boolean delete(Node n){
        if(n == null || n.next == null){
            return false;
        }
        n = n.next;
        return true;
    }

    public int getLength(){
        int length=0;
        Node node=head;
        while(node.next!=null){
            node=node.next;
            length++;
        }
        return length;
    }

    public void print() {
        Node node = head;
        while(node.next != null){
            node = node.next;
            System.out.print(node.data.toString());
        }
        System.out.println();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
