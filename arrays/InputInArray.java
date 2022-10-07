package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Q. Program for take input array n times and print it.
 */
public class InputInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
         arr[0] = 12;
         arr[1] = 21;
         arr[2] = 22;
         arr[3] = 30;
         arr[4] = 100;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[3]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);

        }
    }
}
