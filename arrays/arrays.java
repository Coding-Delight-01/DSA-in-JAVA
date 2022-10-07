package com.arrays;

import java.util.Arrays;

public class arrays {
    // syntax
    /*
    datatype[] variable_name = new datatype[size];
     */
    // by default any reference variable has no value is null
    public static void main(String[] args) {

        // store 5 roll number
        // ref variable = object
        int[] rnos = new int[5];
        int[] num = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(num));

        int[] ros; // declaration of array. ros is getting defined in the stack.
        ros = new int[5]; //intialization: actually here object is being created in the heap memory.

    }
}