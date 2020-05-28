package com.itcr.ce.datos.datoslineales.dataStructures;

public class SinglyList {

    private SinglyNode head;
    private int size;

    public SinglyNode getHead() {
        return head;
    }

    public void add(int data) {
        // Create a new node with given data
        SinglyNode newNode = new SinglyNode(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            // Else traverse till the last node and insert the newNode there
            SinglyNode lastNode = this.head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            // Insert the newNode at last node
            lastNode.setNext(newNode);
        }
        size++;
    }

    public SinglyList addEvenMultodd() {
        SinglyNode current;
        SinglyList list = new SinglyList();
        int addEven = 0;
        int multOdd = 1;
        if (this.head == null) {
            System.out.println("List is empty");
            return null;
        }
        current = this.head;
        for (int i = 0; i < this.size; i++){
            if (i % 2 == 0) {
                addEven += current.getData();
            } else {
                multOdd *= current.getData();
            }
            current = current.getNext();
        }
        list.add(addEven);
        list.add(multOdd);
        return list;
    }

    public void print() {
        SinglyNode currentNode = this.head;

        System.out.print("\n[");

        // Traverse through the LinkedList
        while (currentNode != null) {

            // Print the data at current node
            System.out.print(currentNode.getData());

            if (currentNode.getNext() != null) {
                System.out.print(", ");
            }

            // Go to next node
            currentNode = currentNode.getNext();
        }
        System.out.println("]\n");
    }

}
