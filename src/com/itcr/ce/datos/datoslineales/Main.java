package com.itcr.ce.datos.datoslineales;

import com.itcr.ce.datos.datoslineales.dataStructures.SinglyList;

public class Main {

    public static void main(String[] args) {

        SinglyList list = new SinglyList();
        for (int i = 0; i < 9; i++) {
            list.add(i);
        }
        list.print();

        list.addEvenMultodd().print();

    }

}
