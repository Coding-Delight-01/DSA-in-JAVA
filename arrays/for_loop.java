package com.arrays;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length;i++) {
            arr[i] = in.nextInt();
        }
        for (int j : arr) {
            System.out.println(j + " ");

        for (int num : arr) {  // for every element in the array print the array
            System.out.println(num + " "); // here the num represents the element of the array
        }
        }
    }
}