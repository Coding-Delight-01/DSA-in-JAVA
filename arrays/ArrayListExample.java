package com.arrays;


import java.util.ArrayList;
import java.util.Scanner;

// file not be ArrayList!

public class ArrayListExample {
    //Syntax:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        //for adding elements,

//        list.add(123);
//        list.add(125);
//        list.add(135);
//        list.add(235);
//        list.add(835);
//
//        System.out.println(list);
//
//        //for check element are present or not,
//        list.contains(81309);
//
//        //if we want to update any element in the list,
//        list.set(0,21); //now, new value is assign in the 0th index.
//
//        //remove any index,
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        //input

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] syntax not work here
        }
    }
}