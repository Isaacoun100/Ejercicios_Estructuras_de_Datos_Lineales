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

    public void addPairOfNodes() {
        SinglyNode node1;
        SinglyNode node2;
        SinglyNode addedNode;
        int addedData;
        if (this.head == null || this.head.getNext() == null) {
            System.out.println("Not enough nodes in list");
            return;
        }
        node1 = this.head;
        while (node1.getNext() != null) {
            node2 = node1.getNext();
            addedData =  (node1.getData() + node2.getData());
            addedNode = new SinglyNode(addedData);
            if (node2.getNext() != null) {
                addedNode.setNext(node2.getNext());
                node1 = addedNode.getNext();
                node2.setNext(addedNode);
            }else {
                node2.setNext(addedNode);
                break;
            }
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
