package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class lec18_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[in.nextInt()];
//        int[] arr = new int[];
//        arr[0] = 10;
//        arr[1] = 20;
//        System.out.println("first printable num: " + Arrays.toString(arr));
//
//        System.out.println("now, we get input from user to print number");

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter an number: ");
            arr[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(arr) + " ");
    }

}
