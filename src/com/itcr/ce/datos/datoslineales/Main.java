package com.itcr.ce.datos.datoslineales;

import com.itcr.ce.datos.datoslineales.dataStructures.SinglyList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        SinglyList newList = new SinglyList();
        Random random = new Random();
        int a=0;


        while(a<15){
            newList.add(random.nextInt(25));
            a++;
        }

        System.out.println("The list is:");
        newList.print();

        System.out.println("And their average");

        newList.average();
        newList.print();




        System.out.println("Even added and odd multiplied");

        newList.addEvenMultodd().print();

        System.out.println("Each 2 nodes, will add the sum of the previous");

        newList.addPairOfNodes();
        newList.print();

        System.out.println("Minimum and maximum are");

        newList.maxmin();


    }
}
