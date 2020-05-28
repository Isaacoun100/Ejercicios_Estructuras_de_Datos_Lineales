package com.itcr.ce.datos.datoslineales;

import com.itcr.ce.datos.datoslineales.dataStructures.SinglyList;
import import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SinglyList newList = new SinglyList();
        Random random = new Random();
        int a=0;


        while(a<15){
            newList.add(random.nextInt(25));
        }

        System.out.println("The list is:");

        newList.print();

        System.out.println("Minimum and maximum are");

        newList.maxmin();

        System.out.println("Odd multiplied and even summed");

        addEvenMultodd().print();

        System.out.println("Each 2 nodes, will add the sum of the previous");

        addPairOfNodes();
        newList.print();

        System.out.println("And their average");

        newList.average();
        newList.print();


    }

}
