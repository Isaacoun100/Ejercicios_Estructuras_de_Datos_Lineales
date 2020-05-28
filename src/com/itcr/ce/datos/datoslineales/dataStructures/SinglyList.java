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

    //Excercise 1
    public void average(){

        SinglyNode temp = this.head;
        int total, average;
        total=average=0;

        while(temp!=null){
            total+=temp.getData();
            temp=temp.getNext();
        }
        average=total/size;
        temp=this.head;

        while(temp!=null){
            if (temp.getData()>average){
                this.remove(temp.getData());
            }
            temp=temp.getNext();
        }
    }

    //Excercise 2
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

    //Excercise 3
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

    //Excercise 4
    public void maxmin(){

        SinglyNode temporal= this.head;
        int lowest,highest;
        lowest=highest=head.getData();

        while(temporal!=null){
            if (lowest>temporal.getData()){
                lowest=temporal.getData();
            }
            temporal=temporal.getNext();
        }

        temporal=head;

        while(temporal!=null){
            if (highest<temporal.getData()){
                highest=temporal.getData();
            }
            temporal=temporal.getNext();
        }

        System.out.println("["+lowest+","+highest+"]");

    }

    public void remove(int data){

        SinglyNode previousNode = null;
        SinglyNode currentNode = this.head;

        if(currentNode.getData()==data){
            this.head=currentNode.getNext();
        }

        else{

            while(currentNode!=null){
                previousNode=currentNode;
                currentNode=currentNode.getNext();

                if (currentNode.getData()==data){
                    previousNode.setNext(currentNode.getNext());
                    break;
                }
            }
        }

        size--;
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
