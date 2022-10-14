package com.start;

import java.util.Arrays;

public class swap {
    // no pass by reference in java >- only pass by value
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] nums) {
        nums[0] = 99;


    }

}
