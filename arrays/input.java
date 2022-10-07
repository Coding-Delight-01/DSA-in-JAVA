package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        /*
        introduction to arrays

         */
        int[] rnos = new int[5];
        // or directly you can write:
        int[] rnos1 = {21,22,23};
        System.out.println(Arrays.toString(rnos1));

        int[] ros; //this is known as "declaration" of arrray.
           // ros is getting defined in the stack.
        ros = new int[5]; //"Initialization": actually here object is being created in the memory. (heap memory)

    }
}
