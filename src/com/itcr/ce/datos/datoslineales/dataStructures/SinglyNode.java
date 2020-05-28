package com.itcr.ce.datos.datoslineales.dataStructures;

public  class SinglyNode {

    private int data;
    protected SinglyNode next;

    public SinglyNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }
}
