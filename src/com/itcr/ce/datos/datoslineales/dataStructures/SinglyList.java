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
