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
