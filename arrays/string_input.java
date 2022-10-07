package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class string_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // we take string as a input and print it.

        String[] str = new String[5]; // we intialize the string here means values of the string store in that are being here

        for (int i = 0; i < str.length; i++) {

            str[i] = in.next();

        }
        System.out.println(Arrays.toString(str));
        System.out.println(str[3]);
    }
}